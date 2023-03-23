/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrado;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Quadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double num, quadrado;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero e descubra o mesmo elevado ao quadrado");
        num = entrada.nextDouble();

        quadrado = num * num;

        System.out.println("O qiuadrado de :´"+num+" é : "+quadrado);

    }

}
