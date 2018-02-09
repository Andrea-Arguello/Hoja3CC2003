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
 * @author cooli
 */
public class Radix {

    private static boolean isSorted(ArrayList<Comparable> numbers)
    {
        boolean result;
        for (int i = 1; i < numbers.size(); i++){
            int resultado=numbers.get(i - 1).compareTo(numbers.get(i));
            if (resultado==-1){  
            }

        
        }
        return ;
    }    
 
    public static void radixSort(int[] arr)
    {
        Queue<Integer>[] buckets = new Queue[10];
        for (int i = 0; i < 10; i++)
            buckets[i] = new LinkedList<Integer>();

        boolean sorted = false;
        int expo = 1;

        while ( ! sorted) {
            sorted = true;

            for (int item : arr) {
                int bucket = (item / expo) % 10;
                if (bucket > 0) sorted = false;
                buckets[bucket].add(item);
            }

            expo *= 10;
            int index = 0;

            for (Queue<Integer> bucket : buckets)
                while ( ! bucket.isEmpty())
                    arr[index++] = bucket.remove();
        }

        assert isSorted(arr);
    }
}
