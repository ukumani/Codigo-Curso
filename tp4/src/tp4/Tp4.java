/*
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente 
  en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package tp4;

import java.util.Scanner;



/**
 *
 * @author Azhariel
 */
public class Tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double f;
        float G;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa los grados centigrados");
        G = reader.nextFloat();
        f=32+(9*G/5);
        System.out.println("la Conversion en Fahrenheit es "+Math.round(f)+"F");
    }
    
}
