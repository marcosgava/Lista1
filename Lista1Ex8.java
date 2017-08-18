/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.ex.pkg8;

import java.util.Scanner;

/**
 *
 * @author AcerInfoSW
 */
public class Lista1Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int A, B, x;
        
        System.out.println("Digite dois valores A e B para realizar o cálculo A ^ B: ");
        
        Scanner scan = new Scanner(System.in);
        A = scan.nextInt();
        B = scan.nextInt();
        
        x = (int) Math.pow (A, B);
        
        System.out.println("O resultado da operação " + A + "^" + B + " é: " + x);
    }
    
}
