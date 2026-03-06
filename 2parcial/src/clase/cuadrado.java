/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.util.Scanner;

public class cuadrado {
    public void hacercuadrado() {
        Scanner leer = new Scanner(System.in);
        
        // Dibujamos el cuadrado primero
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
        
        System.out.println("\n--- CALCULANDO CUADRADO ---");
        System.out.print("Ingrese el lado: ");
        int lado = leer.nextInt();
        
        int area = lado * lado;
        int perimetro = lado * 4;
        
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }
}