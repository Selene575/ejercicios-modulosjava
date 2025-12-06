package ProyectoIntegrador_u5.C_empleados;

public class Entidad {
    private String claveEmpleado;
    private double salarioMensual;
    private double porcentajeImpuestos;

    public Entidad(String claveEmpleado, double salarioMensual, double porcentajeImpuestos) {
        this.claveEmpleado = claveEmpleado;
        this.salarioMensual = salarioMensual;
        this.porcentajeImpuestos = porcentajeImpuestos;
    }

    public double calcularSalarioNeto() {
        return salarioMensual - (salarioMensual * (porcentajeImpuestos / 100));
    }

    public void aplicarAumento(double porcentajeAumento) {
        salarioMensual += salarioMensual * (porcentajeAumento / 100);
    }

    public String getClaveEmpleado() {
        return claveEmpleado;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public double getPorcentajeImpuestos() {
        return porcentajeImpuestos;
    }
}
