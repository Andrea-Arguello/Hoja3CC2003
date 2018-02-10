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
    
    protected Comparable[] numeros;
    
    public Sortings (ArrayList<Comparable> ingreso){
        numeros= new Comparable[3000];
        for(Comparable i: ingreso){
            for(int j=0;j<ingreso.size();j++){
            numeros[j]=i;
            }
        }
    }

    public Comparable[] gnome()
	{
            Comparable[] ordenados=new Comparable[3000];
		int index = 0;
            for(Comparable i: numeros){
                for(int j=0;j<numeros.length;j++){
                ordenados[j]=i;
                }
		while (index < 3000)
		{
			if (index == 0)
				index++;
			if (ordenados[index].compareTo(ordenados[index-1]) >= 0)
				index++;
			else
			{
				Comparable temp;
				temp = ordenados[index];
				ordenados[index] = ordenados[index-1];
				ordenados[index-1] = temp;
				index--;
			}
		}
		
	}
            return ordenados;
        }
  // Code Contributed by Mohit Gupta_OMG
// Extraido de https://ide.geeksforgeeks.org/index.php

    /**
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */
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
    
    
    public int QS(Comparable arr[], int low, int high){
        
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
  
    
    
   /*/ public static void mergeSort(Comparable [ ] a)
	{
		Comparable[] tmp = new Comparable[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}


	private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}


    private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
    

    /**
     * Realiza un bubble sort, complejidad de n^2
     * @return la lista ya ordenada
     */
    private Comparable[] Bubble(){
        Comparable[] ordenados=new Comparable[3000];
        for(int i=0; i<numeros.length;i++){
            for(int j=0; j<numeros.length-i; j++){
            int resultado=numeros[j].compareTo(numeros[j+1]);
            if(resultado==1){
                Comparable mayor=numeros[j];
                Comparable menor=numeros[j+1];
                ordenados[j+1]=mayor;
                ordenados[j]=menor;}
            }
        }
        return ordenados;
    }
    
}
