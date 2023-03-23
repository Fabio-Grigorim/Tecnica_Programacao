/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasolina;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Gasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double litros,valorPago;

    Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de litros de gasolina: ");
        litros = entrada.nextDouble();

        valorPago = litros * 4.39;

        DecimalFormat dados = new DecimalFormat("#.00");

        System.out.println("O valor a ser pago pelo cliente é de: R$ "+dados.format(valorPago));


    }

    private static String format(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
