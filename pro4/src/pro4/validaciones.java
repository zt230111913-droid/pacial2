/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro4;

/**
 *
 * package pro4;

/**
 * Clase validaciones: Proporciona servicios de análisis de sintaxis para cadenas.
 * Se encarga de verificar que los datos cumplan con el formato de delimitadores.
 * @author Wizca
 */
public class validaciones {

    /**
     * Método Buscarcomas: Verifica la presencia de al menos dos delimitadores (comas).
     * Es esencial para asegurar que el método .split(",") del Main no falle por falta de elementos.
     * @param d Cadena de entrada (ej: "Manzana,15.0,10")
     * @return true si la estructura es válida, false si faltan comas.
     */
    public boolean Buscarcomas(String d) {
        // Buscamos la posición de la primera coma
        // indexOf devuelve -1 si el carácter no existe en la cadena
        int p = d.indexOf(",");
        
        // Buscamos la segunda coma empezando la búsqueda DESPUÉS de la primera (p + 1)
        int p2 = d.indexOf(",", p + 1);
        
        // --- LÓGICA DE CONTROL ---
        // Se requiere que ambas comas existan (sean distintas de -1)
        if (p != -1 && p2 != -1) {
            return true; // Estructura compatible con el formato Nombre,Precio,Cantidad
        } else {
            // CORRECCIÓN: Debe retornar 'false' para que el Main sepa que hubo un error
            return false; 
        }
    }
}
    

