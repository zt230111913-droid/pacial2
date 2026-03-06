/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wizca
 */
public class Validaciones3 {
    public boolean ValidarLetras(String n){ //No tiene valor de retorno
        //Letras A-Z, a-z, espacio
        int con = 0;
        
        for(int x=0; x<n.length(); x++){
            if((n.codePointAt(x) >= 97 && n.codePointAt(x) <= 122) || (n.codePointAt(x) >= 65 && n.codePointAt(x) <= 90) || (n.codePointAt(x) == 32)){
                con++;
            }
        }
        
        if(con == n.length()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean ValidarNumerosEnteros(String c){
        int con = 0;
        
        for(int y=0; y<c.length(); y++){
            if(c.codePointAt(y) >= 48 && c.codePointAt(y) <= 57){
                con++;
            }
        }
        
        if(con == c.length()){
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean ValidarNumerosConDecimales(String p){
        try{
            float n = Float.parseFloat(p);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
}
    

