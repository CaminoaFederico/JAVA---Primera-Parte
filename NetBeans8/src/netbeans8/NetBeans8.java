
package netbeans8;

import java.io.*;
import java.util.Scanner;

public class NetBeans8 {
//program Socio
    public static void main(String[] args) throws IOException {
        float cuota=0, edad;
        String socio;
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese su edad");
        edad = ingreso.nextFloat();
        
        if(edad>65){
            cuota=(3500*50)/100;
            System.out.println("La cuota que debe abonar es de: " + cuota);
        }
        
        if(edad<18){
            System.out.println("¿Sus padres son socios?");
            socio= ingreso.next();
            
            if(socio.equals("si")){
                cuota=(3500*35)/100;
                System.out.println("La cuota que debe abonar es de: $" + cuota);
            }
            else if(socio.equals("no")){
                cuota=(3500*25)/100;
                System.out.println("La cuota que debe abonar es de: $" + cuota);
            }
        }
        
        if(edad>18 && edad<65){
            cuota=3500;
            System.out.println("La cuota que debe abonar es de: $" + cuota);
        }
    }
    
}
