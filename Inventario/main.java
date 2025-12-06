package ProyectoIntegrador_u5.Inventario;

public class main {
    public static void main(String[] args) {

        // Crear un producto en inventario
        Entidad producto1 = new Entidad("REF-987", 20, 15.50);

        // Mostrar información
        System.out.println("Referencia: " + producto1.getReferencia());
        System.out.println("Cantidad inicial: " + producto1.getCantidad());
        System.out.println("Precio unitario: $" + producto1.getPrecioUnitario());

        // Agregar mercancía
        producto1.agregarMercancia(10);

        // Mostrar cantidad nueva
        System.out.println("Cantidad actual: " + producto1.getCantidad());

        // Calcular el valor total del inventario
        double total = producto1.valorTotal();
        System.out.println("Valor total del stock: $" + total);
    }
}
