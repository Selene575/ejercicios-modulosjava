package ProyectoIntegrador_u5.Cadena_texto;

public class main {
    public static void main(String[] args) {
        Entidad texto = new Entidad("Programación en Java", "MOD10", 60);

        texto.agregarPrefijo("[INFO] ");

        System.out.println("Cadena actual: " + texto.getCadena());
        System.out.println("Espacios encontrados: " + texto.contarEspacios());
    }
}
