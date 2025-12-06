package ProyectoIntegrador_u5.Geometria_basica;

public class Entidad {
    private double base;
    private double altura;
    private String etiqueta;

    public Entidad(double base, double altura, String etiqueta) {
        this.base = base;
        this.altura = altura;
        this.etiqueta = etiqueta;
    }

    public double getBase() { return base; }
    public double getAltura() { return altura; }
    public String getEtiqueta() { return etiqueta; }

    public void setBase(double base) { this.base = base; }
    public void setAltura(double altura) { this.altura = altura; }
    public void setEtiqueta(String etiqueta) { this.etiqueta = etiqueta; }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
