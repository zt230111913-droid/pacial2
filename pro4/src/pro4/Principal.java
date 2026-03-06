/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pro4;

import javax.swing.JOptionPane;

/**
 * Clase Principal: Orquesta la captura de datos compuestos mediante diálogos gráficos.
 * Implementa una estrategia de "Tokenización" para separar una cadena única en múltiples variables.
 * * @author Wizca
 */
public class Principal {
    public static void main(String[] args) {
        // --- SECCIÓN: PREPARACIÓN DE COMPONENTES ---
        validaciones val = new validaciones();
        // Variables locales (Volátiles: se borran al cerrar el programa)
        String nom = "", pre = "", cant = "", datos;
        boolean r1 = false;

        // --- SECCIÓN: CAPTURA Y VALIDACIÓN (LOOP) ---
        while (true) {
            // Entrada de datos en un solo String: "Producto,10.5,5"
            datos = JOptionPane.showInputDialog("Escribe nombre, precio y cantidad separados por coma...");
            
            // Validamos que la cadena tenga el formato de arquitectura esperado (dos comas)
            r1 = val.Buscarcomas(datos); 

            if (r1 == true) {
                System.out.println("Formato de entrada: CORRECTO");
                
                // --- SECCIÓN: DESCOMPOSICIÓN (PARSING) ---
                // El método split corta la cadena cada vez que encuentra una coma
                String[] partir = datos.split(",");
                
                // Asignamos cada "token" a su variable correspondiente
                nom = partir[0];  // El nombre está antes de la primera coma
                pre = partir[1];  // El precio entre la primera y segunda
                cant = partir[2]; // La cantidad después de la segunda

                // --- SECCIÓN: SALIDA DE RESULTADOS ---
                System.out.println("DATOS CAPTURADOS:");
                System.out.println("Nombre: " + nom + "\nPrecio: " + pre + "\nCantidad: " + cant);
                
                // IMPORTANTE: El 'break' detiene el programa. 
                // Para "guardar" de verdad, aquí deberías llamar a una clase de persistencia.
                break; 
                
            } else {
                // Manejo de errores en caso de que falten comas o el formato sea inválido
                System.out.println("Error en la estructura de datos. Vuelve a intentarlo.");
            }
        }
        // Fin del hilo de ejecución principal
    }
}