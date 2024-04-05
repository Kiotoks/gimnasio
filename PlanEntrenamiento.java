package a.gimnasiosas;

public class PlanEntrenamiento {
    private String tipo;
    private String descripcion;
    private int tiempoDuracion; // En minutos

    public PlanEntrenamiento(String tipo, String descripcion, int tiempoDuracion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.tiempoDuracion = tiempoDuracion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Descripción: " + descripcion + ", Duración: " + tiempoDuracion + " minutos";
    }
}
