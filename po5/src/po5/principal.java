/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package po5;

import javax.swing.JOptionPane;

/**
 *
 * @author Wizca
 */



/**
 * Clase Po5: Actúa como contenedor del módulo de captura de datos personales.
 * @author Wizca
 */ 


/**
 * Hacer un programa que pida nombre con apellidos
 * y la fecha de nacimiento separado por "/"
 */
public class principal {
    
    private static String nombre="", fecha="";
    
    public static void main(String[] args) {
        
        validaciones val = new validaciones();
        boolean r = false, r2 = false;
        
        do{
        nombre = JOptionPane.showInputDialog("Escribe el nombre con apellidos");
        r = val.validarNombre(nombre);
            System.out.println("Respuesta es " + r);
            
            if(r == false){
                JOptionPane.showMessageDialog(null, "El nombre esta mal escrito, \n vuelve a intentar");
            }
        }while(r == false);
        
        do{
            fecha = JOptionPane.showInputDialog("Escribe la fecha de nacimiento entre /");
            r2 = val.validarFecha(fecha);
            
            if(r2 == false){
                JOptionPane.showMessageDialog(null, "La fecha esta mal escrita, \n vuelve a intentar");
            }
            
        }while(r2 == false);
        System.out.println("Nombre: " + nombre + " y la fecha: " + fecha) ;
    }
}