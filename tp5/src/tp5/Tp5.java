/*
 * Escribir un programa que lea un número entero por teclado
   y muestre por pantalla el doble, el triple y 
   la raíz cuadrada de ese número. 
   Nota: investigar la función Math.sqrt().

 */
package tp5;

import java.util.Scanner;

/**
 *
 * @author Azhariel
 */
public class Tp5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num; 
      int res;
      int res2;
      Scanner reader = new Scanner(System.in);
      System.out.println("Ingrese un numero");
       num = reader.nextInt();
       res=num*num;
       res2=num*num*num;
       double res3 = Math.sqrt(num);
       System.out.println("El doble de "+num +" es:"+res);
       System.out.println("El triple de "+num+" es:"+res2);
       System.out.println("La raiz cuadrada de "+num+" es:"+res3);
    }
    
}
