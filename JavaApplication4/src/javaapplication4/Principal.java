/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.*;
import java.util.*;
import Generador.Generador;
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
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        randomlist("array",3000);
        
      /*/  ArrayList<Comparable> expresion = new ArrayList<Comparable>();
        int[] listaexpresion = new int[3000];
        File datos = null;
        FileReader reader = null;
        BufferedReader buffer = null;
        try {
            datos = new File("CONCATENAR.txt");
            reader = new FileReader(datos);
            buffer = new BufferedReader(reader);
            String ingreso;
            while ((ingreso = buffer.readLine()) != null) {
                expresion.add(Integer.parseInt(ingreso));
                for(int i=0; i<listaexpresion.length;i++){
                    listaexpresion[i]=Integer.parseInt(ingreso);
                }
            }
        Sortings sorting = new Sortings(expresion); 
        Radix radix = new Radix();
        radix.radixSort(listaexpresion);
            System.out.println("Que sorting desea utilizar?\n 1. Gnome\n 2. Merge\n 3. Quicksort\n 4. Radix\n 5. Bubble");
        } catch (Exception e) {
            System.out.println("Este archivo no existe");
        }
        /*/
    }
    }
    

