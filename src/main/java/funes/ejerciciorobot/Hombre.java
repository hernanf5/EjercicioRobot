
package funes.ejerciciorobot;

public class Hombre {
    
    private String Nombre; 
    
    private String Apellido; 
    
    private int edad; 
    
    public Hombre(String Nombre, String Apellido, int edad){
        this.Nombre=Nombre;
        this.Apellido= Apellido; 
        this.edad= edad; 
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void saludar(){
        System.out.println("Hola mi nombre y apellido es "+Nombre+""+Apellido+" y tengo "+edad+" años");
    }
}
