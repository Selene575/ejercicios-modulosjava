package ProyectoIntegrador_u5.Sistemasr_aereas;

public class main {
    public static void main(String[] args) {

        Entidad vuelo = new Entidad("MX123", 100, 50);

        vuelo.reservarAsiento();

        System.out.println("Asientos reservados: " + vuelo.getAsientosReservados());
        System.out.println("Ocupación: " + vuelo.porcentajeOcupacion() + "%");
    }
}
