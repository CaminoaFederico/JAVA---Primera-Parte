
package netbeans1;

import java.io.*;
import java.util.Scanner;

public class NetBeans1 {
    
    public static void main(String[] args) {
        int numero;
    
        Scanner ingreso = new Scanner(System.in);  
    
        System.out.println("Ingrese un número");
        
        numero = ingreso.nextInt();
        
        System.out.println("El doble del número es: " + numero*2);
    }
    
}
