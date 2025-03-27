public class Alumno {

    //Atributos
    String nombre;
    int nota1;
    int nota2;
    int nota3;

    //Constructor
    public Alumno(String nombre, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    //Metodos
    public void Informacion() {
        System.out.println("Alumno: " + nombre);
        System.out.println("Calificaciones: " + nota1 + "," + nota2 + "," + nota3);
        System.out.println("Promedio: " + ((nota1+nota2+nota3)/3));
    }

    //Main
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Brayan ybañez", 15,13, 18);
        alumno1.Informacion();
    }
}