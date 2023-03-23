/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciomedia;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class ExercicioMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String nome;
    double n1, n2, n3, n4, n5, n6, m1, m2, soma;
       
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite seu nome: ");
        nome = entrada.next();
        
        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        n3 = entrada.nextDouble();
        
        m1 = (n1+n2+n3)/3;
        
        System.out.println(nome+ ", a sua primeira média é: "+m1);
        
        System.out.println("Digite a quarta nota; ");
        n4 = entrada.nextDouble();
        
        System.out.println("Digite a quinta nota: ");
        n5 = entrada.nextDouble();
        
        System.out.println("Digite a sexta nota: ");
        n6 = entrada.nextDouble();
        
        m2 = (n4+n5+n6)/3;
        
        System.out.println(nome+ ", a sua segunda média é: "+m2);
        
        soma = (m1 + m2) /2;
        
        System.out.println(nome + ", a sua Nota Final é: "+ soma);
        
        
    }
    
}
