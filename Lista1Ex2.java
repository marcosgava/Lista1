/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.ex.pkg2;

import java.util.Scanner;

/**
 *
 * @author AcerInfoSW
 */
public class Lista1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float velKm, vel;

System.out.println("Digite uma velocidade em Km/h para realizar a conversão para m/s: ");

Scanner scan = new Scanner (System.in);
velKm = scan.nextFloat();

vel = (float) (velKm * 1.6);

System.out.println("Foi digitada uma velocidade de " + velKm + " Km/h");
System.out.println("E a conversão para m/s é de " + vel + " m/s");
    }
    
}
