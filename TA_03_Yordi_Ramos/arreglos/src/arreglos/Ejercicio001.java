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
public class Ejercicio001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numero = new int[100];
        int i;
           
        
        // Rellena el array con números aleatorios
        for (i = 0; i < 100; i++) {
            
            numero[i] = (int)(Math.random() *21 );
            System.out.print(numero[i] + " ");
            }
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIntroduzca un número de los que se han mostrado: ");
        int valor1 = leer.nextInt();
        System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
        int valor2 = leer.nextInt();

        System.out.println("\n### REEMPLAZANDO EL NUMERO INGRESADO ###");
        
        for (i = 0; i < 100; i++) {
            if (numero[i] == valor1) {
                numero[i] = valor2;
                System.out.print( "\"" + numero[i] + "\" ");
      }         else {
                System.out.print( numero[i] + " ");
      }
    }

    }
    
}
