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
    private ArrayList<Comparable> prueba;
    
    public SortingsTest() {
        prueba= new ArrayList<Comparable>();
        for(int i=0; i<10; i++)
        {
            prueba.set(i,(int) Math.floor(Math.random()*3000)+1);
            System.out.println(prueba.get(i));
        }
        sort= new Sortings(prueba);
    }

    /**
     * Test of Gnome method, of class Sortings.
     */
    @Test
    public void testGnome() {
        sort.gnome();
        boolean expected= true;
        boolean real=false;
        for(int i=1; i<prueba.size();i++){
            if(prueba.get(i+1).compareTo(prueba.get(i))==-1){
                real=false;
            }
            else{
                real=true;
            }
        }
        assertEquals(expected, real);
    }

    /**
     * Test of partition method, of class Sortings.
     */
    @Test
    public void testPartition() {
    }

    /**
     * Test of sort method, of class Sortings.
     */
    @Test
    public void testSort() {
        
    }
    
    /**
     * Test of mergeSort method, of class Sortings.
     */
    @Test
    public void testMergeSort() {
    }
    
}
