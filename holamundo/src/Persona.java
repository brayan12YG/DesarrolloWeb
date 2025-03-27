public class Persona {
    
    //Atributos
    String nombre;
    int edad;
    int celular;
    String ciudad;

    //Constructor
    public Persona(String nombre, int edad, int celular, String ciudad){
        this.nombre= nombre;
        this.edad= edad;
        this.celular= celular;
        this.ciudad= ciudad;
    }

    //Metodo para saludar
    public void saludar(){
        System.out.println("Hola mi nombre es " + nombre + ", y tengo " + edad + " años.");
    }

    public void celular(){
        System.out.println("Mi numero de celular es " + celular);
    }

    public void ciudad(){
        System.out.println("Soy de la ciudad de " + ciudad + "." );
    }

    //Metodo main
    public static void main(String[] args) {
        //Crear el objeto persona
        Persona persona1 = new Persona("Brayan", 24, 950895562, "chimbote");

        //Llamamos al metodo saludar
        persona1.saludar();
        persona1.celular();
        persona1.ciudad();
    }
    
}
