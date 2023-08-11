
package funes.ejerciciorobot;

public class Bateria {
     private int carga;
     public Bateria(int carga) {
        this.carga = 1000;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Bateria{" + "carga=" + carga + '}';
    }
    
    
}
