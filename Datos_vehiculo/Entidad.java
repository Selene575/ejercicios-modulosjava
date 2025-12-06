package ProyectoIntegrador_u5.Datos_vehiculo;

public class Entidad {
    private String marca;
    private int anioFabricacion;
    private int velocidadMaxima;

    public Entidad(String marca, int anioFabricacion, int velocidadMaxima){
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String encender(){
        if(anioFabricacion >= 1990){
            return "El vehículo encendió correctamente";
        } else {
            return "El vehículo es muy antiguo y no encendió";
        }
    }

    public int calcularAntiguedad(){
        int anioActual = 2025; // No se guarda como atributo
        return anioActual - anioFabricacion;
    }
}
