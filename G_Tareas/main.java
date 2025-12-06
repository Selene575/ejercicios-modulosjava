package ProyectoIntegrador_u5.G_Tareas;

public class main {
    public static void main(String[] args) {

        Entidad tarea = new Entidad("Entregar proyecto", "Alta", false);

        System.out.println("¿Es urgente?: " + tarea.esUrgente());

        tarea.completar();
        System.out.println("¿Está completada?: " + tarea.isCompletada());
    }
}
