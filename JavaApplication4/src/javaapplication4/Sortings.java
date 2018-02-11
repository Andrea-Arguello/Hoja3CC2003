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
    
    public Sortings (){
        
    }

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
    
     //MERGE SORT ------------------------------------------------------------------------------
     
     
     
     public Comparable[] dividir(Comparable[] numerosarray){
            int mitad=(int)Math.floor(numerosarray.length/2);
            Comparable[] primeramitad=new Comparable[mitad];
            Comparable[] segundamitad=new Comparable[numerosarray.length-mitad];
                for(int i=0; i<mitad; i ++)
                {
                    primeramitad[i]=numerosarray[i];
                }
                for(int i=mitad; i<numerosarray.length; i ++)
                {
                    for(int j=0; j<numerosarray.length-mitad;j++){
                    segundamitad[j]=numerosarray[i];}
                }
            
                primeramitad=dividir(primeramitad);
                segundamitad=dividir(segundamitad);
                Comparable[] resultado=Merge(primeramitad,segundamitad);
                return resultado;
            }
        

    
    public Comparable[] Merge(Comparable[] uno, Comparable[] dos){
        Comparable[] resultadofinal= new Comparable[uno.length+dos.length];
        int index1=0;
        int index2=0;
        int indexans=0;
        while(index1<uno.length || index2<dos.length){
            if(index1<uno.length && index2<dos.length){
                int answer = uno[index1].compareTo(dos[index2]);
                if(answer==-1){
                    resultadofinal[indexans]= dos[index2];
                    index2++;
                    indexans++;
                }
                else{
                    resultadofinal[indexans]= uno[index1];
                    index1++;
                    indexans++;
                }
            }
        }
        return resultadofinal;
    }
     
     
     
     
     //FIN SORT ------------------------------------------------------------------------------
    /**
     * Realiza un bubble sort, complejidad de n^2
     * @return la lista ya ordenada
     */
     public Comparable[] Bubble(Comparable[] numeros){
        Comparable[] ordenados=new Comparable[numeros.length];
        for(int i=0; i<numeros.length;i++){
            for(int j=0; j<numeros.length-1; j++){
            int resultado=numeros[j].compareTo(numeros[j+1]);
            if(resultado==1){
                ordenados[j+1]=numeros[j];
                ordenados[j]=numeros[j+1];}
            else{
                ordenados[j]=numeros[j];
            }
            }
        }
        return ordenados;
    }
    
}
