/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.ex.pkg7;

import java.util.Scanner;

/**
 *
 * @author AcerInfoSW
 */
public class Lista1Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float temp;
        
        System.out.println("Digite uma temperatura: ");
        
        Scanner scan = new Scanner(System.in);
        temp = scan.nextFloat();
        
        if (temp <= 20){
            System.out.println("Hipotermia. Temperatura de: " + temp +"º");
        }
        
        if (temp > 20 && temp <= 37.5){
            System.out.println("Temperatura Normal. Temperatura de: " + temp + "º");
        }
        
        if (temp > 37.5 && temp <= 42){
            System.out.println("Febre. Temperatura de: " + temp + "º");
        }
        
        if (temp > 42){
            System.out.println("PERIGO!! Temperatura de: " + temp + "º");
        }       
        
        
               
    }
    
}
