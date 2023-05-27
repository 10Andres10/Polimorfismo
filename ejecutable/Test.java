package ejecutable;

import modelo.Cerdo;
import modelo.Serpiente;
import modelo.Vaca;

public class Test {
    
    public static void main(String[] args) {
        
        // Creación de los objetos
        Vaca Daisy = new Vaca();
        Cerdo cerdo = new Cerdo();
        Serpiente serpiente = new Serpiente();
        
        // Se muestra por consola
        System.out.println("Daysi dice: " + Daisy.hablar());   
        System.out.println("Cerdo dice: " + cerdo.hablar());
        System.out.println("Serpiente dice: " + serpiente.hablar());

    }

}
