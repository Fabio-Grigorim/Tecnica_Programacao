/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idade;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String nome;
    int idadeAnos, idadeDias;
    
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite seu nome: ");
        nome = entrada.next();
        
        System.out.println("Digite a sua idade em anos: ");
        idadeAnos = entrada.nextInt();
        
        idadeDias = idadeAnos * 365;
        
        System.out.println(nome +", a sua idade em dias é de: "+ idadeDias);
        
        
    }
    
}
