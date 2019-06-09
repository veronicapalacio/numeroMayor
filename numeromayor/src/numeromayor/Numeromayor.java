/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromayor;

import java.util.Scanner;

/**
 *
 * @author vpala
 */
public class Numeromayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner mayor = new Scanner (System.in) ;
        System.out.println("escriba numero1");
        numero1 = mayor.nextInt();
        System.out.println("scriba un numero2");
        numero2 = mayor.nextInt();
        if (mayorque(numero1,numero2))
            System.out.println("numero1 es mayor");
        if (!mayorque(numero1,numero2))
            System.out.println("numero2 es mayor ");
        else {
            System.out.println("son iguales");
        }
      
    }
    private static boolean mayorque (int n1, int n2){
        return n1 > n2;
    }
        
}
