/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Retangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double a, b, area, perimetro;
    
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite o valor da Altura: ");
        a = entrada.nextDouble();
        
        System.out.println("Digite o valor da Base: ");
        b = entrada.nextDouble();
        
        area = a*b;
        perimetro = (2*a) + (2*b);
        
        System.out.println("A area do retangulo é: "+area+" cm "+ " e o perimetro "+perimetro+" cm");
    
    }
    
}
