/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.ex.pkg3;

import java.util.Scanner;

/**
 *
 * @author AcerInfoSW
 */
public class Lista1Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float temp;

System.out.println("Digite uma temperatura: ");

Scanner scan = new Scanner(System.in);
temp = scan.nextFloat();

if(temp < 0){
	System.out.println("A temperatura digitada foi de: " + temp +"º");
        System.out.print("Essa é uma temperatura negativa.");
}

if(temp > 0){
	System.out.println("A temperatura digitada foi de: " + temp +"º");
        System.out.println("Essa é uma temperatura positiva.");
}

if(temp == 0){
	System.out.println("A temperatura digitada foi 0º.");
}
    }
    
}
