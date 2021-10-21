package generation;

public class Persona {
    //Modificador de acceso privado solo nos permite accesar dentro de la misma clase
    private String nombre;
    private int edad;

    void saludar() {
        System.out.println("Hola, soy " + this.nombre);
    }
}