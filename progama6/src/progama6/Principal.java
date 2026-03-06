/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progama6;
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *RFC para Personas Físicas (13 caracteres)
Se compone de la siguiente manera:
Primeras dos letras: Primera letra y primera vocal del apellido paterno.
Tercera letra: Primera letra del apellido materno.
Cuarta letra: Primera letra del primer nombre.
Fecha de nacimiento (6 dígitos): Año (2 últimos dígitos), mes y día (AAMMDD).
Homoclave (3 últimos caracteres): Asignada por el SAT para garantizar que el RFC sea único e irrepetible
 * @author Wizca
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        String ap = "", am = "", nombre = "", fecha = "";
        validaciones val = new validaciones();
        Operaciones oper = new Operaciones();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        // 1. Pide el NOMBRE (Imagen 1)
        while (true) {
            System.out.println("Escribe el nombre sin apellidos");
            nombre = leer.readLine();
            if (val.ValidarNombreyapellidos(nombre)) {
                break;
            } else {
                System.out.println("Error vuelve a introducirlo");
            }
        }

        // 2. Pide el APELLIDO PATERNO (Imagen 2)
        while (true) {
            System.out.println("Escribe el apellido Paterno");
            ap = leer.readLine();
            if (val.ValidarNombreyapellidos(ap)) {
                break;
            } else {
                System.out.println("Error vuelve a introducirlo");
            }
        }

        // 3. Pide el APELLIDO MATERNO
        while (true) {
            System.out.println("Escribe el apellido Materno");
            am = leer.readLine();
            if (val.ValidarNombreyapellidos(am)) {
                break;
            } else {
                System.out.println("Error vuelve a introducirlo");
            }
        }

        // 4. Pide la FECHA (Usando el método de la Imagen 5 y 6)
        while (true) {
            System.out.println("Escribe la fecha de nacimiento (dd/mm/aaaa)");
            fecha = leer.readLine();
            if (val.ValidarFecha(fecha)) {
                break;
            } else {
                System.out.println("Error vuelve a introducirlo");
            }
        }

        // 5. Muestra el resultado final (Imagen 3)
        oper.RFC(nombre, ap, am, fecha);
    }
}