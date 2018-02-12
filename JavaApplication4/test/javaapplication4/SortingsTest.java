/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cooli
 */
public class SortingsTest {
    
    private Sortings sort;
    private Comparable[] prueba;
    
    
    public SortingsTest() {
        prueba= new Comparable[10];
        for(int i=0; i<10; i++)
        {
            prueba[i]=(int) Math.floor(Math.random()*3000)+1;
        }
        sort= new Sortings();
        
    }

    /**
     * Test of Gnome method, of class Sortings.
     */
    @Test
    public void testGnome() {
        Comparable[] result=sort.gnome(prueba);
        boolean expected= true;
        boolean real=false;
        for(int i=1; i<result.length;i++){
            if(result[i].compareTo(result[i-1])== -1){
                real=false;
            }
            else{
                real=true;
            }
        }
        assertEquals(expected, real);
    }

   

    /**
     * Test of Bubble method, of class Sortings.
     */
    @Test
    public void testBubble() {
        Comparable[] result=sort.Bubble(prueba);
        boolean expected= true;
        boolean real=false;
        for(int i=0; i<9; i++){
            real = result[i].compareTo(result[i+1]) != 1;
        }
        assertEquals(expected, real);
    }

    /**
     * Test of sort method, of class Sortings.
     */
    @Test
    public void testSort() {
        Comparable[] result=sort.sort(prueba,0,9);
        boolean expected= true;
        boolean real=false;
        for(int i=1; i<result.length;i++){
            if(result[i].compareTo(result[i-1])== -1){
                real=false;
            }
            else{
                real=true;
            }
        }
        assertEquals(expected, real);
    }

    /**
     * Test of mergesort method, of class Sortings.
     */
    @Test
    public void testMergesort() {
        Comparable[] result= sort.mergesort(prueba, 0, 9);
        
        boolean expected= true;
        boolean real=false;
        for(int i=1; i<result.length;i++){
            if(result[i].compareTo(result[i-1])== -1){
                real=false;
            }
            else{
                real=true;
            }
        }
        assertEquals(expected, real);
    }

    /**
     * Test of Particion method, of class Sortings.
     */
    @Test
    public void testParticion() {
    }

    /**
     * Test of merge method, of class Sortings.
     */
    @Test
    public void testMerge() {
        
    }
    
}
