/*
 Escribir un programa que pida tu nombre, lo
guarde en una variable y lo muestre por pantalla.
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author Azhriel
 */
public class Tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom;
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese su nombre");
       nom = leer.nextLine();
       System.out.println("¡Hola " + nom + "!");
    }
    
}
