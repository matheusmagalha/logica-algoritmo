/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Matheus
 */

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("me imforme um lado do triangulo: ");
        float ld1 = entrada.nextFloat();
        
        System.out.println("me imforme o segundo lado do triangulo: ");
        float ld2 = entrada.nextFloat();
        
        System.out.println("me imforme o terceiro lado do triangulo:  ");
        float ld3 = entrada.nextFloat();
        
        if (ld1+ld2 >ld3 && (ld2+ld3>ld1 && (ld3+ld1>ld2))){
            
                if (ld1 == ld2 && (ld2 == ld3)){
                    System.out.println("Triangulo equilátero");
            
                }else if (ld1 == ld2 || (ld2 == ld3 || (ld3 == ld1))){
                    System.out.println("Triangulo isóceles");
            
                }else{
                    System.out.println("Triangulo escaleno");
                
                }   
            
        } else{
                    System.out.println("medidas incapazes de formar um triangulo");
                }    
        
    }
}
