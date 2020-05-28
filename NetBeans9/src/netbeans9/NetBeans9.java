
package netbeans9;

import java.io.*;
import java.util.Scanner;

public class NetBeans9 {

    public static void main(String[] args) {
           int filas, columnas, cont=0, n; //variables
           
           Scanner ingreso = new Scanner(System.in); //instanciar objeto
           
           System.out.println("Ingrese un número"); //se ingresa cualquier número
           n = ingreso.nextInt();  //acá se guarda el número
           System.out.println(); //se salta un renglón
           
           for(filas=0; filas<(n*2)-1; filas++){ //la cantidad de filas es igual al (número ingresado * 2) - 1
            cont++; //el contador cuenta hasta llegar al número ingresado       
            if(cont<n){ //mientras el contador sea menor al número ingresado                     
                for(columnas=1; columnas<=cont; columnas++){ //el contador siempre va a ser igual a la columna 
                   System.out.print(columnas); //imprime columnas aumentando
               }               
            }
            else{
                for(columnas=1; columnas<=(n*2)-cont; columnas++){ // cuanto más grande sea el contador, más chica es la cantidad de columnas
                    System.out.print(columnas); //imprime columnas disminuyendo
                }
            }
               System.out.println(); //se salta de renglón
           }          
    }
    
}
