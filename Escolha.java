/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author matheus.mmoura3
 */

import java.util.Scanner;
public class Escolha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("****questão*****");
        System.out.println("seu jogo rpg da materia de projeto integrador deverá seguir qual modelo?\n" + "a-java\n " + "b-python\n" + "c-porta\n" + "d-Design Thinking\n" + "e-banco");
        String resp = entrada.next();
        

        switch (resp) {
            case "a": 
                System.out.println("errado");
                break;
            case "b":
                System.out.println("errado");
                break;
            case "c":
                System.out.println("errado");
                break;
            case "d":
                System.out.println("correto");
                break;
            case "e":
                System.out.println("errado");
                break;
            default:
                System.out.println("valor invalido");
                break;
        }
        
    }
}



