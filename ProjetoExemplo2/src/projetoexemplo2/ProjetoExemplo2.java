/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoexemplo2;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class ProjetoExemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String nome;
    double salario, novoSalario;
    int qtdExtra;
    
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite o seu nome: ");
        nome = entrada.next();
        
        System.out.println("Digite o seu salário: R$ ");
        salario = entrada.nextDouble();
        
        System.out.println("Digite a quantidade de Horas Extras; ");
        qtdExtra = entrada.nextInt();
        
        novoSalario = salario + qtdExtra * 0.50;
        
        System.out.println(nome + ", o seu novo salário será: R$ " +novoSalario);
        
        
    
    }
    
}
