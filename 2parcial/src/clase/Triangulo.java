/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.util.Scanner;

public class Triangulo {
    public void hacerTriangulo() {
        Scanner leer = new Scanner(System.in);

        // Dibujamos el triángulo primero
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");

        System.out.println("\n--- CALCULANDO TRIÁNGULO ---");
        System.out.print("Ingrese la base: ");
        int base = leer.nextInt();
        System.out.print("Ingrese la altura: ");
        int altura = leer.nextInt();
        System.out.print("Ingrese el lado 2: ");
        int lado2 = leer.nextInt();
        System.out.print("Ingrese el lado 3: ");
        int lado3 = leer.nextInt();

        int area = (base * altura) / 2;
        int perimetro = base + lado2 + lado3;

        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }
}