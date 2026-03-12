package Entities;
import java.time.LocalDate;


//Clase que representa un vuelo dentro del sistema
//Contiene la información basica de cada vuelo

public class Vuelo {

    private int id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLlegada;
    private LocalDate fechaSalida;
    private LocalDate fechaLlegada;

    //Constructor que inicializa todos los datos del vuelo
    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida,
                 String lugarLlegada, LocalDate fechaSalida,
                 LocalDate fechaLlegada) {

        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.lugarLlegada = lugarLlegada;
    }
    public int getId() {
        return id;
    }
    public String getNombreVuelo() {
        return nombreVuelo;
    }
    public String getEmpresa() {
        return empresa;
    }
    public String getLugarSalida() {
        return lugarSalida;
    }
    public String getLugarLlegada() {
        return lugarLlegada;
    }
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }
    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    //Representacion del vuelo para mostrarlo en consola
    @Override
    public String toString() {
        return id + " | " + nombreVuelo + " | " + empresa +
                " | " + lugarSalida + " -> " + lugarLlegada +
                " | Salida: " + fechaSalida +
                " | Llegada: " + fechaLlegada;
    }
}
