/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llista.pkg1.ex.pkg13;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AcerInfoSW
 */
public class LLista1Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String texto;
        int vA = 0, vE = 0, vI = 0, vO = 0, vU = 0;
        
        System.out.println("Digite uma palavra para contas as vogais: ");
        
        Scanner scan = new Scanner(System.in);
        texto = scan.next();
        
         for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
                vA++;
            }
            if (texto.charAt(i) == 'e' || texto.charAt(i) == 'E') {
                vE++;
            }
            if (texto.charAt(i) == 'i' || texto.charAt(i) == 'I') {
                vI++;
            }
            if (texto.charAt(i) == 'o' || texto.charAt(i) == 'O') {
                vO++;
            }
            if (texto.charAt(i) == 'u' || texto.charAt(i) == 'U') {
                vU++;
            }

        }
         
            System.out.println("Total de Vogais na palavra: " + (vA + vE + vI + vO + vU));
        
        
        
    }
    
}
