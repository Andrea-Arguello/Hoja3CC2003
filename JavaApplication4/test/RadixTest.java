/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cooli
 */
public class RadixTest {
    
    
    
    public RadixTest() {
    }

    /**
     * Test of radixSort method, of class Radix.
     */
    @Test
    public void testRadixSort() {
       int[] prueba= new int[10];
       for(int i=0; i<10; i++)
        {
            prueba[i]=(int) Math.floor(Math.random()*3000)+1;
            System.out.println(prueba[i]);
        }
        
        Radix radix= new Radix();
        radix.radixSort(prueba);
        System.out.println("Ya ordenado:");
        for(int i:prueba){
            System.out.println(i);
        }
        boolean expected= true;
        boolean real=false;
        for(int i=1; i<prueba.length;i++){
            if(prueba[i-1]>prueba[i]){
                real=false;
            }
            else{
                real=true;
            }
        }
        
        assertEquals(expected,real);
        
        
        
    }
    
}
