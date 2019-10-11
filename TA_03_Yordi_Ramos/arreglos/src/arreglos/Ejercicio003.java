/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import java.util.Scanner;
/**
 *
 * @author Añapa
 */
public class Ejercicio003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numero = new int[100];
        int i;
        // Rellena el array con números aleatorios
        for (i = 0; i < 100; i++) {
            
            numero[i] = (int)(Math.random() * 501 );
            System.out.print(numero[i] + " ");
            }
        Scanner leer = new Scanner(System.in);
        System.out.print("\ndestacar el máximo o minimo valor: ");
        int valor1 = leer.nextInt();
        

        System.out.println("\n### DESTANCANDO EL MINIMO O MAXIMO VALOR ###");
        
        for (i = 0; i < 100; i++) {
            if (numero[i] == valor1) {

                System.out.print( "**" + numero[i] + "**");
      }         else {
                System.out.print( numero[i] + " ");
      }
    }
        // TODO code application logic here
    }
    
}
