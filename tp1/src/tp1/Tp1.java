/*
 *Escribir un programa que pida dos números enteros por teclado y calcule 
  la suma de los dos. El programa deberá
  después mostrar el resultado de la suma

 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author Azhariel
 */
public class Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1;
       int num2;
       int suma;
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese un numero");
       num1= leer.nextInt();
       System.out.println("Ingrese un numero");
       num2= leer.nextInt();
       suma= num1 + num2;
       System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
       
    }
    
}
