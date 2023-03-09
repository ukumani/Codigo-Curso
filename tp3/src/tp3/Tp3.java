/*
 * Escribir un programa que pida una frase y la muestre toda
   en mayúsculas y después toda en minúsculas. 
   Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package tp3;

import java.util.Scanner;

/**
 *
 * @author Azhriel
 */
public class Tp3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una frase");
       frase = leer.nextLine();
       System.out.println(frase.toUpperCase());
       System.out.println(frase.toLowerCase());
    }
    
}
