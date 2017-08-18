/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.ex.pkg10;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AcerInfoSW
 */
public class Lista1Ex10 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        
            int N;
            char let;
            
            System.out.println("Digite uma letra e um número: ");
            Scanner scan = new Scanner(System.in);
            let = (char)System.in.read();
            N = scan.nextInt();
            
            if ( let == 'a' || let == 'e' || let == 'i' || let == 'o' || let== 'u'){
                
                System.out.println("É vogal.");
                for(char i = 0; i < N; i++){
                    System.out.print((char)+ let);
                }
            } else{
                System.out.println("Não é vogal.");
            }
         
        
    }
    
}
