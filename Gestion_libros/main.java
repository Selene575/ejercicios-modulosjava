package ProyectoIntegrador_u5.Gestion_libros;

public class main {
    public static void main(String[] args) {


        Entidad libro1 = new Entidad("A123", "Julio Verne", true, 2010);


        System.out.println("ID: " + libro1.getId());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Disponible: " + libro1.isDisponible());


        libro1.reservar();
        System.out.println("Disponible ahora: " + libro1.isDisponible());

        boolean apto = libro1.esApto(2025);
        System.out.println("¿Es apto para préstamo?: " + apto);
    }
}

