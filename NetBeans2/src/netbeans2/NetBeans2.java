
package netbeans2;

import java.io.*;
import java.util.Scanner;

public class NetBeans2 {

    public static void main(String[] args) {
        float n1;
        float n2;
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        n1 = ingreso.nextFloat();
        
        System.out.println("Ingrese el segundo número");
        n2 = ingreso.nextFloat();
        
        System.out.println("La suma de ambos números es: " + (n1+n2));
    }
    
}
