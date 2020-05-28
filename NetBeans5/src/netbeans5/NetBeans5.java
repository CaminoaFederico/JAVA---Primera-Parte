
package netbeans5;

import java.io.*;
import java.util.Scanner;

public class NetBeans5 {

    public static void main(String[] args) {
        int año=0, a=0, b=0, c=0, d=0, e=0, n=0, fecha=0;
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese el año del cual desea saber la fecha del Domingo de Pascua");
        año = ingreso.nextInt();
        
        a = año%19;
        b = año%4;
        c = año%7;
        
        d = ((19*a) + 24)%30; //24 es una constante que corresponde a los años comprendidos entre el 1900 y el 2199
        e = ((2*b)+(4*c)+(6*d)+5)%7; //5 es una constante que corresponde a los años comprendidos entre el 1900 y el 2099
        
        n=d+e;
        
        if(n<10){
            fecha=n+22;
            System.out.println("La fecha en la que cae el Domingo de Pascua correspondiente al año " + año + " es el " + fecha + " de Marzo");
        }
        if(n>9){
            fecha=n-9;
            System.out.println("La fecha en la que cae el Domingo de Pascua correspondiente al año " + año + " es el " + fecha + " de Abril");
            
            if(fecha==26){
                fecha=fecha-7;
                System.out.println("La fecha en la que cae el Domingo de Pascua correspondiente al año " + año + " es el " + fecha + " de Abril");
            }
            if(d==28 && e==6){
                fecha=fecha-7;
                System.out.println("La fecha en la que cae el Domingo de Pascua correspondiente al año " + año + " es el " + fecha + " de Abril");
            }
        }
    }
    
}
