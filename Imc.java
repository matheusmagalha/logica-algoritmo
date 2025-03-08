/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author matheus.mmoura3
 */
import java.util.Scanner;
public class Imc {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("me fale sua idade: ");
        int idade = entrada.nextInt();
        
        System.out.println("Digite sua altura exp:1,70: ");
        float altura = entrada.nextFloat();
        System.out.println("Digite seu peso: ");
        float peso = entrada.nextFloat();
       
        float massa = peso/(altura*altura);
       
        if (idade >=20 && (massa <18.5 )){
            System.out.println("abaixo do peso ");
        }else if (idade >=20 && (massa >18.5 && (massa <24.99))) {
            System.out.println("peso normal");
        }else if (idade >=20 && (massa >25 && (massa <29.99))){
            System.out.println("Sobrepeso");
        }else if (idade >=20 && (massa >30)){
            System.out.println("obesidade");
        }
        else if (idade >=60 && (massa <22 )){
            System.out.println("abaixo do peso ");
        }else if (idade >=60 && (massa >22 && (massa <27))) {
            System.out.println("peso normal");
        }else if (idade >=60 && (massa >27 && (massa <29.99))){
            System.out.println("Sobrepeso");
        }else if (idade >=60 && (massa >30)){
            System.out.println("obesidade");
        }
        else{
            System.out.println("idade invalida");
        }
        
        
    }
}
