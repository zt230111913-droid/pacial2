/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.util.Scanner;

/**
 *
 * @author Wizca
 */
public class triagulo {
    void hacertriangulo() {
    Scanner leer = new Scanner(System.in);
    int lado;

    System.out.println("***************");
    System.out.println("******  *  ******");
    System.out.println("*****   *   *****");
    System.out.println("****    *    ****");
    System.out.println("***     *     ***");
    System.out.println("**      *      **");
    System.out.println("*       *       *");

    System.out.print("Ingresa el valor del lado del triángulo: ");
    lado = leer.nextInt();

    // Área del triángulo equilátero
    double area = (Math.sqrt(3) / 4) * lado * lado;

  
    
}

    void Hacertriagulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
