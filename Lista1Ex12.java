/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.ex.pkg12;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author AcerInfoSW
 */
public class Lista1Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vA = 1, vB = 2, vC = 3;
        int vD, vE, vF;
        int i = 1;
        
            System.out.println("Digite a senha de 3 dígitos para acesso: ");  
       
            
        do {
            
            Scanner scan = new Scanner(System.in);
            vD = scan.nextInt();
            vE = scan.nextInt();
            vF = scan.nextInt();
            
            if (i == 3){
                 System.out.println("Acesso Bloqueado. 3 Tentativas realizadas");
                 break;
            }

            i++;
            
            if( vD == vA && vE == vB && vF == vC){
                System.out.println("Acesso Liberado");
                break;
            } else {
                System.out.println("Senha incorreta. Tente novamente. Próxima Tentativa: " + i);
                                    
              } 
        } while (i <= 4);

}
}