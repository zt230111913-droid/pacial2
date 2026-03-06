/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2pro2;

/**
 *
 * @author Wizca
 */

public class Validaciones {

    // Método para validar LETRAS (Nombre corregido a ValidarLetras para coincidir con tu Main)
    public boolean ValidarLetras(String n) {
        if (n == null || n.isEmpty()) {
            return false;
        }

        int con = 0;
        for (int x = 0; x < n.length(); x++) {
            int codigo = n.codePointAt(x);
            if ((codigo >= 97 && codigo <= 122) || // a-z
                (codigo >= 65 && codigo <= 90) ||  // A-Z
                codigo == 32) {                    // Espacio
                con++;
            }
        }
        return (con == n.length());
    }

    // Método para validar ENTEROS (Cantidad)
    public boolean ValidarNumerosEnteros(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Método para validar DECIMALES (Precio)
    // Nota: En tu Main llamas a ValidarNumerosConDecimales, así que le pondré ese nombre exacto
    public boolean ValidarNumerosConDecimales(String p) {
        try {
            Float.parseFloat(p);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}