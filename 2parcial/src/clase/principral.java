/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

public class principral {
    public static void main(String[] args) {
        // Primero ejecuta el cuadrado
        cuadrado c = new cuadrado();
        c.hacercuadrado();
        
        // CUANDO TERMINES EL CUADRADO, iniciará el triángulo
        Triangulo t = new Triangulo();
        t.hacerTriangulo();
    }
}