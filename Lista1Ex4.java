/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.ex.pkg4;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author AcerInfoSW
 */
public class Lista1Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char digito;
        
        System.out.println("Para sair, digite 'x': ");
        
        if(digito != 'x'){
            System.out.print("Para sair, digite 'x': ");
            Scanner scan = new Scanner(System.in);
            digito = scan.nextLine().charAt(0);
                    
        }else{
            System.exit(0);
         } 
    }
    
}
