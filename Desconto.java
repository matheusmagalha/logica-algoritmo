/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Matheus
 */

import java.util.Scanner;

public class Desconto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("qual valor da sua compra: ");
        float compra = entrada.nextFloat();
        
        System.out.println("sua compra é a vista 1-sim ou 2-não? ");
        float avista = entrada.nextFloat();
        
        
        if (compra >=300 && (avista == 1)){
            float conta = (compra*15)/100;
            float desconto = compra-conta;
            System.out.println("sua compra no total de R$: " +compra +(" fechou em R$ ") +desconto+ " com o desconto");
            
        }else if (compra <300 && (avista == 1)){
            float conta = (compra*10)/100;
            float desconto = compra-conta;
            System.out.println("Sua compra no valor de R$: " +compra +" fechou em R$ " +desconto + " com o desconto");
        
        }else {
            System.out.println("sua compra ficou em R$: " + compra);
        }
        
   
        
    }
}
