/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_nathalia_michel_de_la_rans_blanco;

import java.util.Scanner;

/**
 *
 * @author Nathalia
 */
public class Lab01_Nathalia_Michel_De_La_Rans_Blanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int HH, MM, SS, day, month, year;
        Scanner sc = new Scanner(System.in);
        
        // Datos de entrada
        System.out.println("Ingrese año");
        year = sc.nextInt();
        
        System.out.println("Ingrese mes");
        month = sc.nextInt();
        
        System.out.println("Ingrese dia");
        day = sc.nextInt();
        
        System.out.println("Ingrese hora");
        HH = sc.nextInt();
        
        System.out.println("Ingrese minutos");
        MM = sc.nextInt();
        
        System.out.println("Ingrese segundos");
        SS = sc.nextInt();
        
        // Calcular la hora 1 segundo despues
        SS = SS + 1;
        
        // TODO: Resetear todo cuando cambia de (segundo, minuto, hora)
        
        if (SS == 60) { // Sumar segundo termina en generar 1 minuto
            SS = 0;
            MM = MM + 1;
            
            if (MM == 60) { // Sumar minuto termina en generar 1 hora
               SS = 0;
               MM = 0;
               HH = HH + 1;
               
               if (HH == 25) { // Sumar hora termina en generar 1 dia
                   SS = 0;
                   MM = 0;
                   HH = 0;
                   day = day + 1;
                   
                   if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month == 2) { // Verificar si el año es bisiesto y es febrero
                       if (day == 30) {
                           month = month + 1;
                           day = 1;
                       }
                       
                       System.out.println("La fecha despues es: " + day + "/" + month + "/" + year + ", " + HH + ":" + MM + ":" + SS);
                   } else {
                       if (month == 2 && day == 29) { // Verificar si el mes es febrero y ver si al sumar el dia se acaba el mez
                           month = month + 1;
                           day = 1;
                           
                       } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 32) { // Verificar si el mes tiene 31 dias y ver si al sumar el dia se acaba el mes
                           month = month + 1;
                           day = 1;
                           
                       } else if (month == 12 && day == 32) { // Verificar si es diciembre y ver si al sumar el dia termina el mes, lo cual comienza un nuevo año
                           year = year + 1;
                           month = 1;
                           day = 1;
                       }
                       
                       System.out.println("La fecha despues es: " + day + "/" + month + "/" + year + ", " + HH + ":" + MM + ":" + SS);
                   }  
                                    
               } else {
                   System.out.println("La fecha despues es: " + day + "/" + month + "/" + year + ", " + HH + ":" + MM + ":" + SS);
               }
                
            } else {
                System.out.println("La fecha despues es: " + day + "/" + month + "/" + year + ", " + HH + ":" + MM + ":" + SS);
            }
            
        } else {
            System.out.println("La fecha despues es: " + day + "/" + month + "/" + year + ", " + HH + ":" + MM + ":" + SS);
        }
    }
    
}
