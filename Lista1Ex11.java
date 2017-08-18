/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.ex.pkg11;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author AcerInfoSW
 */
public class Lista1Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String a;
        a = "Jean";
        String b;
        
        System.out.println("Digite um nome: ");
        
        Scanner scan = new Scanner(System.in);
        b = scan.next();
        
        if (a.equalsIgnoreCase(b)){
            System.out.println("Foi digitado o nome Jean.");
        } else{
            System.out.println("Foi digitado outro nome.");
        }
    }
    
}
