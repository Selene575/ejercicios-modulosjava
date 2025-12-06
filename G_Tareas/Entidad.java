package ProyectoIntegrador_u5.G_Tareas;

public class Entidad {
    private String descripcion;
    private String prioridad;
    private boolean completada;

    public Entidad(String descripcion, String prioridad, boolean completada) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = completada;
    }

    public void completar() {
        completada = true;
    }

    public boolean esUrgente() {
        return prioridad.equalsIgnoreCase("Alta") && !completada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }
}
