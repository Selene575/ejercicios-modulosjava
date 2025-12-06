package ProyectoIntegrador_u5.Geometria_basica;

public class main {
    public static void main(String[] args) {

    Entidad r = new Entidad(8, 4, "Rectángulo");

    System.out.println("El área es: " + r.calcularArea());
    System.out.println("El perímetro es: " + r.calcularPerimetro());
}
}
