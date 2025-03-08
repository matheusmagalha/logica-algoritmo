/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author matheus.mmoura3
 */
import java.util.Scanner;

public class Somar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
       
        if (numero >=100) {
           int result = numero+150;
            System.out.println("a soma do seu numero com + 150 dá " +result);

        }else{
            System.out.println(numero);
        }
        
    }
}

