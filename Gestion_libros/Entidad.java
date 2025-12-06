package ProyectoIntegrador_u5.Gestion_libros;

public class Entidad {

    private String id;
    private String autor;
    private boolean disponible;
    private int anioPublicacion;

    public Entidad(String id, String autor, boolean disponible, int anioPublicacion) {
        this.id = id;
        this.autor = autor;
        this.disponible = disponible;
        this.anioPublicacion = anioPublicacion;
    }

    public String getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void reservar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido reservado");
        } else {
            System.out.println("No se puede reservar porque ya está prestado");
        }
    }
    public boolean esApto(int anioActual) {
        int antiguedad = anioActual - anioPublicacion;
        return antiguedad > 5;
    }
}