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
    public static Comparable[] gnome(Comparable[] lista, int i)
	{
		int index = 0;

		while (index < i)
		{
			if (index == 0)
				index++;
			if (lista[index].compareTo(lista[index-1]) >= 0)
				index++;
			else
			{
				Comparable temp;
				temp = lista[index];
				lista[index] = lista[index-1];
				lista[index-1] = temp;
				index--;
			}
		}
		return lista;
	}
  // Code Contributed by Mohit Gupta_OMG
// Extraido de https://ide.geeksforgeeks.org/index.php
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
