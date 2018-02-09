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
   void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
<<<<<<< HEAD
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
   /** Codigo obtenido de: https://www.geeksforgeeks.org/merge-sort/
=======
    
>>>>>>> 12e34ef2fde38616d5070a64463c64e3e4beb5a1
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
