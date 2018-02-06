/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;

/**
 *
 * @author massa
 */
public class Sortings {
    
    private ArrayList<Integer> numeros;
    
    public Sortings (){
        numeros= new ArrayList<Integer>();
    }
    private int[] Gnome(){
    int[] list = new int[3000];
   for ( int i = 1; i < numeros.size(); ) { 
         if((int)numeros.get(i-1) <=(int) numeros.get(i)){ 
            i++; 
         } else { 
            int tempVal = (int) numeros.get(i); 
            numeros.set(i, numeros.get(i - 1)); 
            numeros.set(i - 1, tempVal); 
            i--; 
            if ( i == 0 ) { 
               i = 1; 
            }           
         } 
      }
        
        return null;
    } 
    
    private int[] QS(){
        
        
        return null;
    }
    
}
