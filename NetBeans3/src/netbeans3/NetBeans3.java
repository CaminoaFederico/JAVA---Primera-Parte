
package netbeans3;

import java.io.*;
import java.util.Scanner;

public class NetBeans3 {

    public static void main(String[] args) throws IOException {
        float n1;
        float n2;
        
        char signo;
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        n1 = ingreso.nextFloat();
        
        System.out.println("Ingrese el segundo número");
        n2 = ingreso.nextFloat();
        
        System.out.println("Ingrese un signo");
        signo = (char) System.in.read();
        
        if(signo=='+'){
            System.out.println("La suma es: " + (n1+n2));
        }
        if(signo=='-'){
            System.out.println("La resta es: " + (n1-n2));
        }
        if(signo=='*'){
            System.out.println("La multiplicación es: " + (n1*n2));
        }
        if(signo=='/'){
            System.out.println("La división es: " + (n1/n2));
        }
        if(signo=='%'){
            System.out.println("El porcentaje es: " + (n1*n2/100));
        }
    }
    
}
