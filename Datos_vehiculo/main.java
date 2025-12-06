package ProyectoIntegrador_u5.Datos_vehiculo;

public class main {
    public static void main(String[] args) {
        Entidad auto = new Entidad("Nissan", 2015, 180);

        System.out.println("Marca: " + auto.encender());
        System.out.println("Antigüedad del vehículo: " + auto.calcularAntiguedad() + " años");
    }
}
