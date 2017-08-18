/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.ex.pkg9;

import java.util.Scanner;

/**
 *
 * @author AcerInfoSW
 */
public class Lista1Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float sal, cont;
        
        System.out.println("Digite seu salário para realizar o cálculo da Previdência Social: ");
        
        Scanner scan = new Scanner(System.in);
        sal = scan.nextFloat();
        
        if (sal > 880 && sal <= 1659.38){
            cont = (sal * 8)/100;
            System.out.println("Seu salário é de: R$ " + sal);
            System.out.println("Seu percentual de contribuição é de 8%");
            System.out.println("Sua contribuição é de: R$ " + cont);
        }
        
        if (sal >= 1659.39 && sal <= 2765.66 ){
            cont = (sal * 9)/100;
            System.out.println("Seu salário é de: R$ " + sal);
            System.out.println("Seu percentual de contribuição é de 9%");
            System.out.println("Sua contribuição é de: R$ " + cont);
        }
        
        if (sal >= 2765.67 && sal <= 5531.31){
            cont = (sal * 11)/100;
            System.out.println("Seu salário é de: R$ " + sal);
            System.out.println("Seu percentual de contribuição é de 11%");
            System.out.println("Sua contribuição é de: R$ " + cont);
        }
    
}
}
