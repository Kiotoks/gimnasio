/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.gimnasiosas;
import java.util.ArrayList;

public class PlanAlimento {
    private Nutricionista nutricionista;
    private ArrayList<Plato> platos = new ArrayList<Plato>();

    public PlanAlimento(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }

    public Nutricionista getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }

    public void addPlato(Plato p) {
        this.platos.add(p);
    } 
    
}
    
