/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2pro2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// donde hace un prgrama que lea nombre precion la cantida del´producto 
/**
 *
 * @author Wizca
 */
public class Principal {
     public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String nombre="", precio="", cantidad="";
        String respuesta;
        Validaciones val= new Validaciones();
   do{
       boolean bandera= true;
       while(bandera  == true){//while(bandera)
           System.out.println("Escribe el nombre de un producto");
            nombre = leer.readLine(); 
          if(val.ValidarLetras(nombre)){
              bandera = false;
          }else{
              System.out.println("Error al escribir el nombre, vuevel a intentarlo");
          }
       }  
       while(bandera == false){
           System.out.println("Escribe el precio");
           precio = leer.readLine();
         
           if(val.ValidarNumerosConDecimales(precio)){
               bandera = true;            
            }else{
                System.out.println("Error al escribir el precio, vuevel a intentarlo");
            }
       }
       while(bandera == true){
           System.out.println("Escribe la cantidad");
           cantidad = leer.readLine();
         
           if(val.ValidarNumerosEnteros(cantidad)){
               bandera = false;            
            }else{
                System.out.println("Error al escribir el precio, vuevel a intentarlo");
            }
       }
       System.out.println("El Nombre es: "+nombre+"\n"+" y el precio es: "+precio+"\n"+
               " Y la cantidad es: "+cantidad+"\n"+
                       " y total es:"+Float.parseFloat(precio)*Integer.parseInt(cantidad));
       
         System.out.println("Deseas otro producto");
         respuesta = leer.readLine();
    }while(respuesta.equals("Si") || respuesta.equals("SI") 
            || respuesta.equals("si"));   
    }
}

