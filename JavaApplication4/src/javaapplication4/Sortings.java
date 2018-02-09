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

    
    protected ArrayList<Comparable> numeros;
    
    public Sortings (ArrayList<Comparable> ingreso){
        numeros= new ArrayList<Comparable>();
        for(Comparable i: ingreso){
            for(int j=0;j<ingreso.size();j++){
            numeros.set(j,i);
            }
        }
    }
    
    
    public static int partition(Comparable arr[], int low, int high){
        Comparable pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j].compareTo(pivot) <= 0 )
            {
                i++;
 
                // swap arr[i] and arr[j]
                Comparable temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        Comparable temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
    
    
    private int QS(Comparable arr[], int low, int high){
        
         Comparable pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j].compareTo(pivot) <= 0 )
            {
                i++;
 
                // swap arr[i] and arr[j]
                Comparable temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        Comparable temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
   /**
    * Funcion principal que ordena una lista de objetos que implementan la clase Comparable utilizando QuickSort
    * @param arr
    * @param low
    * @param high
    * @return
    */
    public static Comparable[] sort(Comparable arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
        return arr;
       
    }

    // Codigo obtenido de: http://www.geeksforgeeks.org/iterative-quick-sort/
    /*This code is contributed by Rajat Mishra */
    private ArrayList<Comparable> Merge(){
        ArrayList<Comparable> ordenados=new ArrayList<Comparable>();
        {
            
        }
        return ordenados;
    }
    
    /**
     * Realiza un bubble sort, complejidad de n^2
     * @return la lista ya ordenada
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
