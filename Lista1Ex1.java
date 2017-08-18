/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.ex.pkg1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AcerInfoSW
 */
public class Lista1Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float vol, alt, lar, prof;

System.out.println("O programa irá calcular o volume de um paralelepípedo.\n");
System.out.println("Digite a altura, largura e profundidade do paralelepípedo: ");

Scanner scan = new Scanner(System.in);

System.out.print("Altura: ");
alt = scan.nextFloat();
System.out.print("Largura: ");
lar = scan.nextFloat();
System.out.print("Profundidade: ");
prof = scan.nextFloat();

vol = alt * lar * prof;

System.out.println("O volume do paralelepípedo informado é: " + vol +" m³");
    }
    
}
