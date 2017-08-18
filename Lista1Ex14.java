/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.ex.pkg14;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author AcerInfoSW
 */
public class Lista1Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] vlr;
        vlr = new int [10];
        int maior = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Infome 10 valores: ");
               
        for (int i = 0; i < 10; i++){
            vlr[i] = scan.nextInt();
        }
        
        for(int i = 0; i < 10; i++){
                if(vlr[i] > maior){
                maior = vlr[i];
            }
        }
        
        for(int i = 0; i < 10; i++){
            System.out.print("[" + vlr[i] + "]");
        }
        
        System.out.println("\nO maior valor informado foi: " + maior);
        
    }
    
}
