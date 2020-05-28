
package netbeans7;

import java.io.*;
import java.util.Scanner;

public class NetBeans7 {
//program Pares
    public static void main(String[] args) {
        int n;
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        n = ingreso.nextInt();
        
        if(n%2==0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
    }
    
}
