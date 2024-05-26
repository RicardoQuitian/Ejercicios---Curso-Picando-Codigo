public class MainApp {
    public static void main (String [] args) {
        // Crear una instancia  de la clase persona
        Persona persona = new Persona ("Juan", 25);
        persona = new Persona("Ricardo", 24);
        // Crear una instancia de la clase Saludo
        Saludo saludo = new Saludo ();

        System.out.println(saludo.generarSaludo(persona));
    }
}

// Segunda clase en el mismo archivo
class  Persona {
   private String nombre;
    private int edad;

    // Constructor
    public Persona (String nombre, int  edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    // Getters

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

}

// Tercera clase en el mismo archivo

class Saludo {
    // Método que genera un saludo para una persona
    public String generarSaludo(Persona persona){
        return "Hola, " + persona.getNombre() + "! tienes " + persona.getEdad() + " años. ";
    }
}

/*
Clase Principal (MainApp):
public class MainApp: Esta es la clase pública principal, y el nombre del archivo debe coincidir con el nombre de esta clase (MainApp.java).
public static void main(String[] args): El método principal que actúa como punto de entrada de la aplicación.
Dentro del método main, se crean instancias de las clases Persona y Saludo, y se utiliza el método generarSaludo de la clase Saludo para
generar un saludo personalizado para la persona.

Clase Secundaria (Persona):
class Persona: Esta es una clase que no es pública.
Atributos: nombre y edad son atributos privados de la clase Persona.
Constructor: Inicializa los atributos nombre y edad.
Getters: Métodos públicos para acceder a los atributos nombre y edad.

Clase Terciaria (Saludo):
class Saludo: Otra clase que no es pública.
generarSaludo(Persona persona): Un método que toma un objeto Persona y devuelve un saludo personalizado como una cadena de texto.

Notas Importantes
Modularidad: Este ejemplo muestra cómo separar responsabilidades en diferentes clases. La clase Persona se encarga de representar los
datos de una persona, mientras que la clase Saludo se encarga de generar un saludo basado en una instancia de Persona.
Reutilización: La clase Saludo puede reutilizarse para generar saludos para cualquier instancia de Persona, haciendo el
código más modular y reutilizable.
Encapsulación: La clase Persona utiliza encapsulación, haciendo que sus atributos nombre y edad sean privados y proporcionando
métodos públicos (getNombre y getEdad) para acceder a ellos.
Este ejemplo ilustra cómo estructurar el código en Java de manera que sea claro, modular y fácil de mantener, incluso cuando se
tienen múltiples clases en el mismo archivo. Si tienes más preguntas o necesitas más ejemplos, ¡déjame saber!

Usos de this en Java
Distinguir Variables de Instancia de Parámetros del Método o Constructor:
Cuando los nombres de las variables de instancia son iguales a los nombres de los parámetros del método o constructor, se utiliza
this para distinguir entre ellos.
this puede ser utilizado para manejar variables de instancia, evitar la ambigüedad y llamar a otros constructores dentro de una clase.

 */