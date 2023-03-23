/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario2;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Salario2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double salario, percentual, novoSal;
    
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite o valor do seu salário: ");
        salario = entrada.nextDouble();
        
        System.out.println("Digite o percentual de aumento: ");
        percentual = entrada.nextDouble();
        
        novoSal = salario + (salario*percentual)/100;
        
        System.err.println("O seu novo salário será de: R$"+ novoSal);   
    
    
    }
    
}
