/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */





/**
 *
 * @author Wizca
 */// 1. Importaciones necesarias para que funcione BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// 3. Tu clase principal (ya sin la clase Po3 estorbando)
public class Principal3 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        String nombre = "", precio = "", cantidad = "";
        Validaciones3 val = new Validaciones3();
        String respuesta;
        
        do {
            boolean bandera = true;
            
            while(bandera == true) { 
                System.out.println("Escribe el nombre de un producto:");
                nombre = leer.readLine();
                
                if(val.ValidarLetras(nombre)) {
                    bandera = false;
                } else {
                    System.out.println("Error al escribir el nombre, vuelve a intentarlo.");
                }
            }
            
            while(bandera == false) {
                System.out.println("Escribe el precio del producto:");
                precio = leer.readLine();
                
                if(val.ValidarNumerosConDecimales(precio)) {
                    bandera = true;
                } else {
                    System.out.println("Error al escribir el precio, vuelve a intentarlo.");
                }
            }
            
            while(bandera == true) {
                System.out.println("Escribe la cantidad del producto:");
                cantidad = leer.readLine();
                
                if(val.ValidarNumerosEnteros(cantidad)) {
                    bandera = false;
                } else {
                    System.out.println("Error al escribir la cantidad, vuelve a intentarlo.");
                }
            }
            
            // Un pequeño formato extra para que se vea como ticket
            float total = Float.parseFloat(precio) * Integer.parseInt(cantidad);
            System.out.println("\n--- TICKET ---");
            System.out.println("Producto: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("TOTAL: $" + total + "\n");
        
            System.out.println("¿Deseas otro producto? (Si/No)");
            respuesta = leer.readLine();
            
            // TIP: equalsIgnoreCase compara sin importar si es mayúscula o minúscula
        } while(respuesta.equalsIgnoreCase("si")); 
        
        System.out.println("¡Gracias por su compra!");
    }
}