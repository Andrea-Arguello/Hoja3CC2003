/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author massa
 */
public class Sortings {
    
    public Sortings (){
        
    }

    /**
     * 
     * @param lista lista a ordenar
     * @return lista ordeanda
     */
    public Comparable[] gnome(Comparable[] lista)
	{
		int index = 0;
                int i = lista.length; //<===== aqui le asigno tamano
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
    /**
     * Parte el quick sort
     * @param arr array
     * @param low minimo
     * @param high maximo
     * @return int 
     */
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
 
    /**
     * Ordena el array del quick sort
     * @param arr array
     * @param low minimo
     * @param high maximo
     * @return array ordenado
     */
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
    
     //MERGE SORT ------------------------------------------------------------------------------
     

     
  
     

     /**
      * Une las dos mitades
      * @param arr array
      * @param l minimo
      * @param m mitad
      * @param r maximo
      */
      public void merge(Comparable arr[], int l, int m, int r)

    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = (int) arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = (int) arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // indices iniciales de subarrays
        int i = 0, j = 0;
 
        // indice de subarray inicial
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
 
        /* Copiar elementos restantes de L[] si hay */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copiar elementos restantes de  R[] si hay */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
      /**
       * ordena el array
       * @param arr array 
       * @param l minimo
       * @param r maximo
       * @return array ordenado
       */
   public Comparable[] mergesort( Comparable arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            mergesort(arr, l, m);
            mergesort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
        return arr;
    }
     //codigo apoyado en el de: https://www.geeksforgeeks.org/merge-sort/
     //FIN SORT ------------------------------------------------------------------------------
   
   //BUBBLE SORT------------------------------------------------------------------------------
    /**
     * Realiza un bubble sort, complejidad de n^2
     * @return la lista ya ordenada
     */
     public Comparable[] Bubble(Comparable[] numeros){
        Comparable temporal;
        for(int i=0; i<numeros.length-1;i++){
            for(int j=0; j<numeros.length-i-1; j++){
                int resultado=numeros[j].compareTo(numeros[j+1]);
                if(resultado==1){
                    temporal=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=temporal;}
                
                }
            
        }
        return numeros;
    }
    
}
