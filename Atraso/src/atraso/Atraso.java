/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atraso;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Atraso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double prest,taxa,tempo,atraso;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digiete o valor da prestação");
        prest = entrada.nextDouble();

        System.out.println("Digite a taxa de juros");
        taxa = entrada.nextDouble();

        System.out.println("Digite a quantos meses em atraso");
        tempo = entrada.nextDouble();

        atraso = prest+(prest*taxa/100)*tempo;

        System.out.println("O novo valor da prestação será de : "+atraso);

    }

}
