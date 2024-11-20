/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.StringTokenizer;

/**
 *
 * @author steven
 */
public class Tokens {
    public static void main(String[] args) {
        
        String correo = "steven@gmail.com@jnsd";
        
        StringTokenizer s = new StringTokenizer(correo, "@");
        
        while (s.hasMoreElements()) {
            System.out.println(s.nextToken());
            
        }
        
        
        
        
    }
    
    
}
