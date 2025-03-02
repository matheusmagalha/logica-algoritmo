/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Matheus
 */

import java.util.Scanner;

public class Bissexto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite um ano com 4 digitos");
        int ano = entrada.nextInt();
        

       
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
           System.out.println(ano+ " é bissexto");
           
       }else{
           System.out.println(ano+" não bissexto");
       }
    }
}


/*Dado um ano com 4 dígitos dizer se ele é um ano bissexto ou não. (Lembre-se que
um ano é bissexto se ele for divisível por 400 ou se ele for divisível por 4 e não
por 100.)*/