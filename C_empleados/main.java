package ProyectoIntegrador_u5.C_empleados;

public class main {
    public static void main(String[] args) {

        Entidad emp = new Entidad("EMP001", 12000, 10);

        System.out.println("Salario neto: " + emp.calcularSalarioNeto());

        emp.aplicarAumento(15);
        System.out.println("Salario con aumento: " + emp.getSalarioMensual());
    }
}
