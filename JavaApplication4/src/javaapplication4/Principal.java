/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.*;
import java.util.*;
/**
 *
 * @author cooli
 */
public class Principal{
    // CREACIO DE ARCHIVO DE NUMEROS RANDOM---------------------------------------------------------------
    public static String randomlist(String filePath, int listSize) {
		
        try{
			PrintWriter archivo = new  PrintWriter(filePath, "UTF-8");
			Random random = new Random(); // Ranndom object
			for(int i = 0; i < listSize; i++){
				archivo.print(random.nextInt(3000) + ","); 
			}
			archivo.close(); 
			return "el archivo ha sido generado con exito";
	}
        catch (IOException e)
        {
			
			return e.getMessage();
		}
	}
   //FIN  ARCHIVO------------------------------------------------------------------------------------------- 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        
        //Esto de aqui te crea el archivo txt con numeros Random
          
   
         try {
            PrintWriter writer = new PrintWriter("CONCATENAR.txt", "UTF-8");
            for (int i=0; i<3000; i++){ 
                int randomInt = (int)Math.floor(Math.random()*3000);
                writer.println(randomInt); 
            }
            writer.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        //Lee el txt y lo convierte en lista de comparables y de int
        FileReader file = new FileReader("CONCATENAR.txt");
        Comparable[] lista  = new Comparable[3000];
        int[] listaint = new int[3000];
        int i=0;
        try {
            Scanner input = new Scanner(file);
            while(input.hasNext())
            {
                lista[i] = input.nextInt();
                listaint[i]=(int) lista[i];
                i++;
           
            }
            input.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        } 
        
        Sortings sorts = new Sortings();
        Radix rad= new Radix();
        sorts.Particion(lista,0,2999);
        sorts.merge(lista, 0, 1499, 2999);
        System.out.println("Lista sin ordenar: " + Arrays.toString(lista));
        System.out.println("LISTAS ORDENADAS: ");
        System.out.println();
        System.out.println("lista ordenada por QuickSort" + Arrays.toString(sorts.sort(lista, 0,2999)));
        System.out.println("Lista ordenada por Radix sort" + Arrays.toString(rad.radixSort(listaint)));
        System.out.println("Lista ordenada por Gnome sort" + Arrays.toString(sorts.gnome(lista)));
        System.out.println("Lista ordenada por Bubble sort" + Arrays.toString(sorts.Bubble(lista)));
        System.out.println("Lista ordenada por Merge sort" + Arrays.toString(sorts.mergesort(lista,0,2999)));
    }
    }
    

