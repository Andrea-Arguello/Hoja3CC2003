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
    
    protected ArrayList<Comparable> numeros;
    
    public Sortings (ArrayList<Comparable> ingreso){
        numeros= new ArrayList<Comparable>();
        for(Comparable i: ingreso){
            for(int j=0;j<ingreso.size();j++){
            numeros.set(j,i);
            }
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
        
        
        return numeros;
    }
    
    private ArrayList<Comparable> Merge(){
        ArrayList<Comparable> ordenados=new ArrayList<Comparable>();
        {
            
        }
        return ordenados;
    }
    
    /**
     * Realiza un bubble sort, complejidad de n^2
     * @return 
     */
    private ArrayList<Comparable> Bubble(){
        ArrayList<Comparable> ordenados=new ArrayList<Comparable>();
        for(int i=0; i<numeros.size();i++){
            for(int j=0; j<numeros.size()-i; j++){
            int resultado=numeros.get(j).compareTo(numeros.get(j+1));
            if(resultado==1){
                Comparable mayor=numeros.get(j);
                Comparable menor=numeros.get(j+1);
                ordenados.set(j+1, mayor);
                ordenados.set(j,menor);}
            }
        }
        return ordenados;
    }
    
}
