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

    public Comparable[] gnome(Comparable[] lista, int i)
	{
		int index = 0;
                i = numeros.length; //<===== aqui le asigno tamano
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
    
  
      
    
   //QUICK SORT-----------------------------------------------------------------------------------------------
    public int Particion(Comparable arr[], int low, int high){
        
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
 
     public  Comparable[] sort(Comparable arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = Particion(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
        return arr;
    }
    
    
    // FIN QUICKSORT-------------------------------------------------------------------------
    /**
     * Realiza un bubble sort, complejidad de n^2
     * @return la lista ya ordenada
     */
    public Comparable[] Bubble(){
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
