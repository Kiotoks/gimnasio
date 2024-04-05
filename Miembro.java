package a.gimnasiosas;

public class Miembro extends Persona {
    private int presentismo;
    private Progreso progreso;
    private PlanEntrenamiento planE;
    private PlanAlimento planA;

    public Miembro(int presentismo, Progreso progreso, PlanEntrenamiento planE, PlanAlimento planA, String nombre, String apellido, Genero genero, String contraseña) {
        super(nombre, apellido, genero, contraseña);
        this.presentismo = presentismo;
        this.progreso = progreso;
        this.planE = planE;
        this.planA = planA;
    }

    public int getPresentismo() {
        return presentismo;
    }

    public void setPresentismo(int presentismo) {
        this.presentismo = presentismo;
    }

    public Progreso getProgreso() {
        return progreso;
    }

    public void setProgreso(Progreso progreso) {
        this.progreso = progreso;
    }

    public PlanEntrenamiento getPlanE() {
        return planE;
    }

    public void setPlanE(PlanEntrenamiento planE) {
        this.planE = planE;
    }

    public PlanAlimento getPlanA() {
        return planA;
    }

    public void setPlanA(PlanAlimento planA) {
        this.planA = planA;
    }

   

}









