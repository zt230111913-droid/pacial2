/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progama6;

/**
 *
 * @author Wizca
 */
public class validaciones {
 

    // Valida que el texto solo contenga letras y espacios (Imagen 4 y 5)
    public boolean ValidarNombreyapellidos(String dato) {
        int c = 0;
        for (int i = 0; i < dato.length(); i++) {
            // Rango minúsculas (97-122), mayúsculas (65-90) y espacio (32)
            if ((dato.codePointAt(i) >= 97 && dato.codePointAt(i) <= 122) ||
                (dato.codePointAt(i) >= 65 && dato.codePointAt(i) <= 90) ||
                (dato.codePointAt(i) == 32)) {
                c++;
            }
        }
        return (c == dato.length() && !dato.isEmpty());
    }

    // Valida el formato de fecha dd/mm/aaaa (Imagen 5 y 6)
    public boolean ValidarFecha(String f) {
        int c = 0;
        String[] n = f.split("/");
        
        if (n.length == 3) {
            for (int x = 0; x < 3; x++) {
                if (ValidarNumeros(n[x])) {
                    c++;
                }
            }
            return (c == 3);
        }
        return false;
    }

    // Verifica si un String es un número válido (Imagen 7)
    private boolean ValidarNumeros(String d) {
        try {
            Integer.parseInt(d);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}