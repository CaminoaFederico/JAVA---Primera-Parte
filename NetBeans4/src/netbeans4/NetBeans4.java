
package netbeans4;

import java.io.*;
import java.util.Scanner;
import java.math.MathContext;

public class NetBeans4 {

    public static void main(String[] args) {
        double a, b, c, cuenta=0, x1=0, x2=0;
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingreso el primer número de la ecuación cuadrática");
        a = ingreso.nextInt();
        
        System.out.println("Ingreso el segundo número de la ecuación cuadrática");
        b = ingreso.nextInt();
        
        System.out.println("Ingreso el tercer número de la ecuación cuadrática");
        c = ingreso.nextInt();
        
        cuenta = ((b*b) - (4*a*c));
        
        if(a!=0){
        if(cuenta<0){
            System.out.println("La ecuación no tiene solución real");
        }
        if(cuenta==0){
            System.out.println("La ecuación tiene sólo una raíz real"); 
            x1=(-b)/(2*a);
            System.out.println("La solución de la ecuación es: x1 = x2 = " + x1);
        }
        if(cuenta>0){
            System.out.println("La ecuación tiene dos soluciones reales");
            x1=(((-b)+(Math.sqrt(cuenta)))/(2*a));
            x2=(((-b)-(Math.sqrt(cuenta)))/(2*a));
            System.out.println("La solución de la ecuación es: x1 = " + x1 + " y x2 = " + x2);
        }
        }
        else{
            System.out.println("El coeficiente cuadrático tiene que ser distinto de cero");
        }       
    }
    
}
