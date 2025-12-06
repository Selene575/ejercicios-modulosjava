package ProyectoIntegrador_u5.Cuentas_bancarias;

public class Entidad {
    public String numeroCuenta;
    public String titular;
    public double saldo;

    public Entidad(String num, String nom, double sal){
        this.numeroCuenta = num;
        this.titular = nom;
        this.saldo = sal;
    }

    public void depositar(double cantidad){
        saldo += cantidad;
    }

    public void retirar(double cantidad){
        if (cantidad <= saldo){
            saldo -= cantidad;
        }
    }
}
