
package netbeans6;

import java.io.*;
import java.util.Scanner;

public class NetBeans6 {

    public static void main(String[] args) {
        String meses;
        
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese un mes");
        meses = ingreso.nextLine();
        
        switch(meses){
            case "enero":
            System.out.println("El mes "+meses+" tiene 31 días");
            break;
            case "febrero":
            System.out.println("El mes "+meses+" tiene 28 días (o 29 en año bisiesto)");
            break;
            case "marzo":
            System.out.println("El mes "+meses+" tiene 31 días");
            break;
            case "abril":
            System.out.println("El mes "+meses+" tiene 30 días");
            break;
            case "mayo":
            System.out.println("El mes "+meses+" tiene 31 días");
            break;
            case "junio":
            System.out.println("El mes "+meses+" tiene 30 días");
            break;
            case "julio":
            System.out.println("El mes "+meses+" tiene 31 días");
            break;
            case "agosto":
            System.out.println("El mes "+meses+" tiene 31 días");
            break;
            case "septiembre":
            System.out.println("El mes "+meses+" tiene 30 días");
            break;
            case "octubre":
            System.out.println("El mes "+meses+" tiene 31 días");
            break;
            case "noviembre":
            System.out.println("El mes "+meses+" tiene 30 días");
            break;
            case "diciembre":
            System.out.println("El mes "+meses+" tiene 31 días");
            break;      
            default:
            System.out.println("Mes incorrecto (recuerde escribir en minúscula)");
            break;
        }
    }
    
}
