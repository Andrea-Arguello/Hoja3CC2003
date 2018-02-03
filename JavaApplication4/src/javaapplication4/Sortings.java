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
    
    private ArrayList numeros;
    
    public Sortings (){
        
    }
    private int[] Gnome(){
    int[] list = new int[3000];
   for ( int i = 1; i < theArray.length; ) { 
         if ( theArray[i - 1] <= theArray[i] ) { 
            i++; 
         } else { 
            int tempVal = theArray[i]; 
            theArray[i] = theArray[i - 1]; 
            theArray[i - 1] = tempVal; 
            i--; 
            if ( i == 0 ) { 
               i = 1; 
            }           
         } 
      }
        
        return null;
    } 
    
}
