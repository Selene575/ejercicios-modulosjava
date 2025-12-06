package ProyectoIntegrador_u5.Temperatura_clima;

public class Entidad {
    private double valor;
    private String unidad;
    private String fecha;

    public Entidad(double valor, String unidad, String fecha) {
        this.valor = valor;
        this.unidad = unidad;
        this.fecha = fecha;
    }

    // Método 1: Convertir temperatura
    public void convertir() {
        if (unidad.equalsIgnoreCase("Celsius")) {
            valor = (valor * 9/5) + 32;
            unidad = "Fahrenheit";
        } else {
            valor = (valor - 32) * 5/9;
            unidad = "Celsius";
        }
    }

    // Método 2: Temperatura extrema (>40° Celsius)
    public boolean esExtrema() {
        if (unidad.equalsIgnoreCase("Celsius")) {
            return valor > 40;
        } else {
            double c = (valor - 32) * 5/9;
            return c > 40;
        }
    }

    public double getValor() {
        return valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public String getFecha() {
        return fecha;
    }
}

