/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venda_movel;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Venda_movel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double sal, bonus, movel;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de moveis vendidos : ");
        movel = entrada.nextDouble();

        bonus = movel*50;
        sal = 1000 + bonus;

        System.out.println("O salario desse mes será de : R$ "+sal);


    }

}
