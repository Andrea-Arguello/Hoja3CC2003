/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Edd Mann from http://eddmann.com/posts/least-significant-digit-lsd-radix-sort-in-java/
 */
public class Radix {  
    
    public Radix(){
        
    }
   
    /**
     * 
     * @param ingreso lista de enteros al azar
     * @return lista de enteros ya ordenados
     */
    public int[] radixSort(int[] ingreso)
    {
        Queue<Integer>[] buckets = new Queue[10];
        for (int i = 0; i < 10; i++)
            buckets[i] = new LinkedList<Integer>();

        boolean sorted = false;
        int expo = 1;

        while ( ! sorted) {
            sorted = true;

            for (int item : ingreso) {
                int bucket = (item / expo) % 10;
                if (bucket > 0) sorted = false;
                buckets[bucket].add(item);
            }

            expo *= 10;
            int index = 0;

            for (Queue<Integer> bucket : buckets)
                while ( ! bucket.isEmpty())
                    ingreso[index++] = bucket.remove();
        }

        return ingreso;
    }
}
