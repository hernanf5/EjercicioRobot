
package funes.ejerciciorobot;

public class Robot {
    private  Bateria bat;
    private  boolean descansando;

    public Robot(Bateria bateria, boolean dormido) {
        this.bat = bateria;
        this.descansando = dormido;
    }

    public void avanzar(int pasos) {
        int energiaPerdida = (pasos / 100) * 10;
        if (!descansando) {
            
            if (bat.getCarga() >= energiaPerdida) {
                bat.setCarga(bat.getCarga() - energiaPerdida);
                System.out.println("Se ha avanzado: " + pasos+ "pasos");
            } else {
                System.out.println("No se puede avanzar");
                System.out.println("Unidades de bateria insuficiente: " + bat.getCarga());
            }
        } else {
            System.out.println("El robot está dormido");
        }
    }

    public void retrocer(int pasos) {
        int energiaPerdida = (pasos / 100) * 10;
        if (!descansando) {
            if (bat.getCarga() >= energiaPerdida) {
                bat.setCarga(bat.getCarga() - energiaPerdida);
                System.out.println("Se ha retrocedido " + pasos+ "pasos");
            } else {
                System.out.println("No se puede retroceder");
                System.out.println(" Unidades de bateria insuficiente: "+ bat.getCarga());
            }
        } else {
            System.out.println("El robot está dormido");
        }
    }

    public boolean dormir(boolean dormido) {
        return dormido;
    }

    public boolean despertar(boolean despertar) {
        return descansando;
    }
    
    public boolean bateriaLlena(){
        return bat.getCarga()==1000;
    }
    
    public boolean bateriaVacia(){
        return bat.getCarga()==0;
    }
    public int energiaActual() {
        return bat.getCarga();
    }
    
}
