/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoentradadados;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class ProjetoEntradaDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int n1, n2, soma, dif, produto, divisao;
    
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();
        
        soma = n1 + n2;
        dif = n1 - n2;
        produto = n1 * n2;
        divisao = n1 / n2;
        
        System.out.println("O valor da soma é : "+soma);
        System.out.println("O valor da diferença é : "+dif);
        System.out.println("O valor da multiplicação é : "+produto + "\n O valor da divisão é :"+divisao);
    
    }
    
    
    
}
