/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobro_triplo;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Dobro_Triplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1, n2, dobro, triplo;
        
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Digite um numero e descubra qual é o dobro :");
         n1 = entrada.nextInt();
         
         System.out.println("Digite um numero e descubra o triplo dele : ");
         n2 = entrada.nextInt();
         
         dobro = n1*2;
         triplo = n2*3;
         
         System.out.println("O dobro do primeiro numero é : " + dobro + " e o triplo do segundo numero é : "+triplo );
        
        // TODO code application logic here
    }
    
}
