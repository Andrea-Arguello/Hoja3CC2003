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
    
    private ArrayList<Comparable> numeros;
    
    public Sortings (ArrayList<Comparable> ingreso){
        numeros= new ArrayList<Comparable>();
        for(Comparable i: ingreso){
        }
    }
    
    public ArrayList<Comparable> Gnome(){
   for ( int i = 1; i < numeros.size(); ) { 
         if((int)numeros.get(i-1) <=(int) numeros.get(i)){ //Se debe usar compareTo, devuelve -1 si es menor, 1 si es mayor, 0 si es igual
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
        return numeros;
       
    } 
    
    private ArrayList<Comparable> QS(){
        
        
        return null;
    }
    
    private ArrayList<Comparable> Merge(){
        for(Comparable i: numeros)
        {
            
        }
        return null;
    }
    
    
    private int[] Bubble(){
        return null;
    }
    
}
