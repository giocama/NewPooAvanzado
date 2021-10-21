package generation;

public class Main {

    public static int numerador = 10;
    public static int denominador = 0;
    public static float division;

    public static void main(String[] args) {

        System.out.println("ANTES DE HACER LA DIVISION");

        try {
            /*division = numerador / denominador;*/
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Soy finally");
        }

            System.out.println("DESPUES DE HACER LA DIVISION");

	/*Persona persona = new Persona();
	persona.nombre = "Giovanni";
	persona.edad = 30;*/

	/*Animal animal = new Animal();
	animal.nombre = "Iguana";*/

        /*CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Giovanni Calleja");
        cuenta.setClave("dgkjdfhk-5623");
        cuenta.setSaldo(5000);

        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();*/

        /*Person person= new Person("Santiago", 33, "102045455");
        person.setName("Santiago");
        person.setAge(33);
        person.setId("102045455");

        System.out.println( "Id: " +  person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());*/

        }
    }