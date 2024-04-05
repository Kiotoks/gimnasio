/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.gimnasiosas;

/**
 *
 * @author garci
 */
public class Plato {
    private String desc;
    private int calorias;
    private String tipo;

    public Plato(String desc, int calorias, String tipo) {
        this.desc = desc;
        this.calorias = calorias;
        this.tipo = tipo;
    }
  
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
