/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author matheus.mmoura3
 */
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
       
        System.out.println("digite um numero: ");
        float num1 = entrada.nextFloat();
        
        System.out.println("digite outro numero: ");
        float num2 = entrada.nextFloat();
        
        System.out.println("você quer fazer sua conta com adição-1,subtração-2,divisão-3 ou multiplicaçã-4? ");
        int num3 = entrada.nextInt();
        
       
        if (num3 == 1 ){
            float result = num1 + num2;
            System.out.println(result);
           
        }else if (num3 == 2) {
            float result = num1 - num2;
            System.out.println(result);
           
        }else if (num3 == 3) {
            float result = num1/num2;
            System.out.println(result);
            
        }else if (num3 == 4) {
            float result = num1*num2;
            System.out.println(result);
        }        
            
    }
}
