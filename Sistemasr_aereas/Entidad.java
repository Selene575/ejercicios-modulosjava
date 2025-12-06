package ProyectoIntegrador_u5.Sistemasr_aereas;

public class Entidad {
    private String codigoVuelo;
    private int capacidadMaxima;
    private int asientosReservados;

    public Entidad(String codigoVuelo, int capacidadMaxima, int asientosReservados) {
        this.codigoVuelo = codigoVuelo;
        this.capacidadMaxima = capacidadMaxima;
        this.asientosReservados = asientosReservados;
    }

    public void reservarAsiento() {
        if (asientosReservados < capacidadMaxima) {
            asientosReservados++;
        }
    }

    public double porcentajeOcupacion() {
        return (asientosReservados * 100.0) / capacidadMaxima;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }
}
