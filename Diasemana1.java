/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author matheus.mmoura3
 */

import java.util.Scanner;

public class Diasemana1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        
        System.out.println("****agenda*****");
        System.out.println("me fale um numero de 1 a 7!");
        int num = entrada.nextInt();
        
        switch (num) {
            case 1: 
                System.out.println("domingo");
                break;
            case 2: 
                System.out.println("segunda");
                break;
            case 3: 
                System.out.println("terça");
                break;
            case 4: 
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6: 
                System.out.println("sexta");
                break;
            case 7: 
                System.out.println("sabado");
                break;
            default:
                System.out.println("valor invalido");
                break;
            }
    
    }
}

