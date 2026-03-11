
import Entities.Vuelo;
import Utils.VueloUtils;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

//Clase principal donde se crean los vuelos de prueba
//Y se ejecuta el filtro

public class Main {

    //Constante de fecha para el filtro
    private static final LocalDate fechaInicio = LocalDate.of(2025,5,10);
    private static final LocalDate fechaFin = LocalDate.of(2025,6,1);

    public static void main(String[] args) {

        List<Vuelo> vuelos = new ArrayList<>();

        //10 vuelos de prueba

        vuelos.add(new Vuelo(1,"H001-V","Iberia","Madrid","Buenos Aires",LocalDate.of(2025,5,10),LocalDate.of(2025,5,11)));
        vuelos.add(new Vuelo(2, "H002-V", "Turkish", "Barcelona", "New York",LocalDate.of(2025,5,20),LocalDate.of(2025,5,21)));
        vuelos.add(new Vuelo(3,"H003-V","Air France","Paris","Madrid",LocalDate.of(2025,6,5),LocalDate.of(2025,6,5)));
        vuelos.add(new Vuelo(4,"H004-V","Lufthansa", "Berlin", "Barcelona",LocalDate.of(2025,5,15),LocalDate.of(2025,5,26)));
        vuelos.add(new Vuelo(5,"H005-V","Iberia","Madrid", "New York",LocalDate.of(2025,5,25),LocalDate.of(2025,5,26)));
        vuelos.add(new Vuelo(6,"H006-V","Emirates","Dubai","Madrid",LocalDate.of(2025,7,1),LocalDate.of(2025,7,2)));
        vuelos.add(new Vuelo(7,"H007-V","Turkish","Istanbul","Barcelona",LocalDate.of(2025,5,5),LocalDate.of(2025,5,5)));
        vuelos.add(new Vuelo(8,"H008-V","Iberia","Madrid", "Paris",LocalDate.of(2025,5,30),LocalDate.of(2025,6,30)));
        vuelos.add(new Vuelo(9,"H009-V","Delta", "New York","Madrid",LocalDate.of(2025,6,10),LocalDate.of(2025,6,11)));
        vuelos.add(new Vuelo(10,"H010-V","LATAM","Buenos Aires","Barcelona",LocalDate.of(2025,5,12),LocalDate.of(2025,5,13)));

        //Mostarmos todos los vuelos antes de aplicar el filtro
        System.out.println("Lista completa de vuelos:\n");

        for (vuelo v : vuelos) {
            System.out.println(v);
        }

        //Aplicamos el filtro
        List<Vuelo> vuelosFiltrados =
                VueloUtils.filtrarVuelos(vuelos, fechaInicio, fechaFin);

        //Mostramos las fechas
        System.out.println("\nFecha inicio: " + fechaInicio);
        System.out.println("Fecha fin: " + fechaFin);

        //Mostramos los vuelos filtrados
        System.out.println("\nVuelos filtrados:\n");

        for (Vuelo v : vuelosFiltrados) {
            System.out.println(v);
        }

    
    }

}
