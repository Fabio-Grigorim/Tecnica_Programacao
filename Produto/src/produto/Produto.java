/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Produto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String nome;
    int qtdCompra;
    double precoUni, total;
    
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite o nome do produto: ");
        nome = entrada.next();
        
        System.out.println("Digite a quantidade comprada desse produto: ");
        qtdCompra = entrada.nextInt();
        
        System.out.println("Digite o valor unitário do produto: ");
        precoUni = entrada.nextDouble();
        
        total = qtdCompra * precoUni;
        
        System.out.println("Voce comprou "+qtdCompra+" "+nome+" e o valor da sua compra foi de "+total);
    
    }
    
}
