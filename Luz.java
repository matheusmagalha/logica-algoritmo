/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author matheus.mmoura3
 */
import java.util.Scanner;

public class Luz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
       
        System.out.println("quantos kwh vocÊ consumiu: ");
        float kwh = entrada.nextFloat();
       
        if (kwh <150 ){
            System.out.println("você consumiu 0,20");
           
        }else if (kwh >=150 && (kwh <500)) {
            System.out.println("R$0,25");
           
        }else if (kwh >=500)
            System.out.println("R$0,30");
    }
}
