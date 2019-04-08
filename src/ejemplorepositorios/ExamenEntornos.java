/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorepositorios;

import java.util.Scanner;

/**
 *
 * @author dam07
 */
public class ExamenEntornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre1, mensaje;
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        nombre1 = teclado.nextLine();
        System.out.print("Introduce un mensaje de ánimo para los alumnos de 1DAM en su arduo examen:");
        mensaje = teclado.nextLine();
        System.out.println( nombre1 + " te manda un mensaje de ánimo: "+ mensaje);
    } 
}

    
    

