
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
     public void JugarConRobot(Robot robot) {
         
        if (robot.bateriaVacia()) {
            System.out.println("El robot no puede jugar, su batería está vacía.");
            return;
        }
        
        if (robot.dormir(true)) {
            System.out.println("El robot está dormido, primero hay que despertarlo.");
            return;
        }
        
        System.out.println("Jugando con el robot...");
        
        robot.avanzar(5);
        
        robot.retrocer(3);
        
        robot.energiaActual();
        
        int energiaActual = robot.energiaActual();
        System.out.println("Energía actual del robot: " + energiaActual);
        
        if (robot.bateriaLlena()) {
            System.out.println("La batería del robot está llena.");
        } else {
            System.out.println("La batería del robot no está llena.");
        }
    }
}

