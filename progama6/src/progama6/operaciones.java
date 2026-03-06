/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progama6;

/**
 *
 * @author Wizca
 */
        
  class Operaciones {
   public void RFC(String n, String ap, String am, String fecha){
        String rfc = "";
        //System.out.println(n.toUpperCase()+" "+ap.toUpperCase()+" "+am.toUpperCase()+" "+fecha);
        n = n.toLowerCase();
        ap = ap.toLowerCase();
        am = am.toLowerCase();
        n = n.replace("de", "");
        n = n.replace("la", "");
        n = n.replace("ma", "");
        ap = ap.replace("de", "");
        ap = ap.replace("la", "");
        am = am.replace("de", "");
        am = am.replace("la", "");
        System.out.println(n+" "+ap+" "+am);
        n = n.toUpperCase();
        ap = ap.toUpperCase();
        am = am.toUpperCase();
        //cruz Cu
        if(ap.codePointAt(1) == 64 ||
                ap.codePointAt(1) == 69 ||
                ap.codePointAt(1) == 73 ||
                ap.codePointAt(1) == 79 ||
                ap.codePointAt(1) == 85){
            rfc = ap.substring(0, 2);
        }else{
            rfc = rfc + ap.charAt(0);
            rfc = rfc + ap.charAt(2);
        }
        rfc = rfc + am.charAt(0);
        rfc = rfc + n.charAt(0);
        System.out.println(rfc);
        
        String [] f = fecha.split("/");
        rfc = rfc + f[0].substring(2);//2000/12/20
        rfc = rfc + f[1];
        rfc = rfc + f[2];
        System.out.println(rfc);
    }
    
}
                
   

    

