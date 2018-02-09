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
public class MergeTest {
    
    public MergeTest() {
    }

    /**
     * Test of dividir method, of class Merge.
     */
    @Test
    public void testDividir() {
        ArrayList<Comparable> prueba= new ArrayList<Comparable>();
       for(int i=0; i<10; i++)
        {
            System.out.println("Sin ordenar");
            prueba.set(i, ((int) Math.floor(Math.random()*3000)+1));
            System.out.println(prueba.get(i));
        }
        
        Merge merge= new Merge();
        ArrayList<Comparable> answer=merge.dividir(prueba);
        System.out.println("Ya ordenado:");
        for(Comparable i:answer){
            System.out.println(i);
        }
        boolean expected= true;
        boolean real=false;
        for(int i=1; i<answer.size();i++){
            if(answer.get(i-1).compareTo(answer.get(i))==1){
                real=false;
            }
            else{
                real=true;
            }
        }
        
        assertEquals(expected,real);
    }

    /**
     * Test of unir method, of class Merge.
     */
    @Test
    public void testUnir() {
        ArrayList<Comparable> prueba1= new ArrayList<Comparable>();
        ArrayList<Comparable> prueba2= new ArrayList<Comparable>();
       for(int i=0; i<5; i++)
        {
            System.out.println("Prueba uno:");
            prueba1.set(i, (int) Math.floor(Math.random()*3000)+1);
            System.out.println(prueba1.get(i));
            System.out.println("Prueba dos:");
            prueba2.set(i, (int) Math.floor(Math.random()*3000)+1);
            System.out.println(prueba2.get(i));
        }
        
        Merge merge= new Merge();
        ArrayList<Comparable> answer=merge.unir(prueba1,prueba2);
        System.out.println("Unido:");
        for(Comparable i:answer){
            System.out.println(i);
        }
        boolean expected= true;
        boolean real=false;
        for(int i=1; i<answer.size();i++){
            if(answer.get(i-1).compareTo(answer.get(i))==1){
                real=false;
            }
            else{
                real=true;
            }
        }
        
        assertEquals(expected,real);
    }
    
}
