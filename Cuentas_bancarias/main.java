package ProyectoIntegrador_u5.Cuentas_bancarias;

public class main {
        public static void main(String[] args) {

            Entidad cuenta1 = new Entidad("12345", "Selene Mena", 2000);

            System.out.println("Saldo inicial: " + cuenta1.saldo);

            cuenta1.depositar(500);
            System.out.println("Saldo después del depósito: " + cuenta1.saldo);

            cuenta1.retirar(700);
            System.out.println("Saldo después del retiro: " + cuenta1.saldo);
        }
    }

