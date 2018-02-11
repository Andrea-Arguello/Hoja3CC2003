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
        System.out.println("Array de prueba");
        for(int i=0; i<10; i++)
        {
            prueba[i]=(int) Math.floor(Math.random()*3000)+1;
            System.out.println(prueba[i]);
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
     * Test of Particion method, of class Sortings.
     */
    @Test
    public void testParticion() {
    }

    /**
     * Test of dividir method, of class Sortings.
     */
    @Test
    public void testDividir() {
    }

    /**
     * Test of Merge method, of class Sortings.
     */
    @Test
    public void testMerge() {
    }

    /**
     * Test of Bubble method, of class Sortings.
     */
    @Test
    public void testBubble() {
        Comparable[] result=sort.Bubble(prueba);
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
    
}
