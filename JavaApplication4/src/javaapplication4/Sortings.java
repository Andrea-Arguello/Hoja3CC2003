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
    
    /** The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
   
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
 
   // public Comparable[] dividir(Comparable[] numerosarray){
    

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
=======
            int mitad=(int)Math.floor(numerosarray.length/2);
            Comparable[] primeramitad=new Comparable[mitad];
            Comparable[] segundamitad=new Comparable[numerosarray.length-mitad];
                for(int i=0; i<mitad+1; i ++)
                {
                    primeramitad[i]=numerosarray[i];
                }
                for(int i=mitad+1; i<numerosarray.length; i ++)
                {
                    for(int j=0; j<numerosarray.length-mitad;j++){
                    segundamitad[j]=numerosarray[i];}
                }
            
                primeramitad=dividir(primeramitad);
                segundamitad=dividir(segundamitad);
                Comparable[] resultado=Merge(primeramitad,segundamitad);
                return resultado;
            }
        
>>>>>>> 52c23c4c6118d04f3b2fbe2462dbaaadaf43827e

    
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
