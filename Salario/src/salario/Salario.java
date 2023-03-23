/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int salMinimo, salFunc, qtdSal;
    
    Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu salário :");
        salFunc = entrada.nextInt();
        
        System.out.println("Digite o valor do salário mínimo: ");
        salMinimo = entrada.nextInt();
        
        qtdSal = salFunc / salMinimo;
        
        System.out.println("Voce recebe: "+qtdSal+" salarios minimos.");
        
        
    
    
    
    }
    
}
