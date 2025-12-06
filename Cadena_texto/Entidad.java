package ProyectoIntegrador_u5.Cadena_texto;

public class Entidad {
    private String cadena;
    private String idModulo;
    private int longitudMaxima;

    public Entidad(String cadena, String idModulo, int longitudMaxima) {
        this.cadena = cadena;
        this.idModulo = idModulo;
        this.longitudMaxima = longitudMaxima;
    }

    // Método 1: Añadir prefijo
    public String agregarPrefijo(String prefijo) {
        String nuevaCadena = prefijo + cadena;
        if (nuevaCadena.length() <= longitudMaxima) {
            cadena = nuevaCadena;
        }
        return cadena;
    }

    // Método 2: Contar espacios en blanco
    public int contarEspacios() {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }

    public String getCadena() {
        return cadena;
    }

    public String getIdModulo() {
        return idModulo;
    }

    public int getLongitudMaxima() {
        return longitudMaxima;
    }
}
