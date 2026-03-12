package Utils;

import Entities.Vuelo;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Clase utilitaria que contiene la logica para filtrar vuelos
//Segun las fechas indicadas


public class VueloUtils {

    //Filtrar una lista de vuelos segun fechaInicio y fechaFin

    public static List<Vuelo> filtrarVuelos(List<Vuelo> vuelos,
                                                 LocalDate fechaInicio,
                                                 LocalDate fechaFin) {
        return vuelos.stream()

                //Aplico filtros segun las fechas introducidas
                .filter(Vuelo vuelo -> {
                    LocalDate fecha = vuelo.getFechaSalida();

                    //Si no se envia ninguna fecha -> devolver todos
                    if (fechaInicio == null && fechaFin == null) {
                        return true;
                    }
                    //Si solo hay fechaFin -> vuelos hasta esa fecha
                    if (fechaInicio == null) {
                        return !fecha.isAfter(fechaFin);
                    }
                    //Si solo hay fechaInicio -> vuelos desde esa fecha
                    if (fechaFin == null) {
                        return !fecha.isBefore(fechaInicio);
                    }
                    //Si hay ambas fechas -> vuelos dentro del rango
                    return !fecha.isBefore(fechaInicio) && fecha.isAfter(fechaFin);
                })

                //Ordenar siempre por fecha de salida
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))

                //Convertir el resultado a la lista
                .collect(Collectors.toList());

    }
}
