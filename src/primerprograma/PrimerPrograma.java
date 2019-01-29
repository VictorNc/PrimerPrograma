/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AlumnoUTM
 */
public class PrimerPrograma {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int a;
        int b = 0;
        int c = 0;
        int d = 0;
        System.out.println("Indique un valor numerico ");
        a = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de a = " + a);
        System.out.println("---------");
        System.out.println("Indique un valor numerico de b ");
        a = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de b = " + b);
        System.out.println("-----------");
         System.out.println("Indique un valor numerico de c");
        a = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de c = " + c);
        System.out.println("Hola profe");
         System.out.println("Indique un valor numerico de d ");
        a = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de d = " + d);
        System.out.println("hola como estan");
    }
    
}
