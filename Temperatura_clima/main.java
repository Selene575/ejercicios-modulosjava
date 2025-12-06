package ProyectoIntegrador_u5.Temperatura_clima;

public class main {
    public static void main(String[] args) {

        Entidad temp = new Entidad(42, "Celsius", "2025-01-10");

        System.out.println("¿Es extrema?: " + temp.esExtrema());

        temp.convertir();
        System.out.println("Valor convertido: " + temp.getValor() + " " + temp.getUnidad());
    }
}
