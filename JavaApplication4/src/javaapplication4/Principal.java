/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author cooli
 */
public class Principal{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Comparable> expresion = new ArrayList<Comparable>();
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
            }
        Sortings sorting = new Sortings(expresion); 
        sorting.Gnome();
        } catch (Exception e) {
            
            
        }
        
    }
    }
    

