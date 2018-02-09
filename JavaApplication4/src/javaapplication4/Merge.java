/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;

/**
 *
 * @author cooli
 */
public class Merge {
    
    public ArrayList<Comparable> dividir(ArrayList<Comparable> numeros){
    
            int mitad=numeros.size()/2;
            ArrayList<Comparable> primeramitad=new ArrayList<Comparable>();
            ArrayList<Comparable> segundamitad=new ArrayList<Comparable>();
            ArrayList<Comparable> resultado=new ArrayList<Comparable>();
            if(numeros.size() % 2 == 0)
            {
                for(int i=0; i<mitad+1; i ++)
                {
                    primeramitad.set(i, numeros.get(i));
                }
                for(int i=mitad+1; i<numeros.size(); i ++)
                {
                    segundamitad.set(i, numeros.get(i));
                }
            }
            else{
                for(int i=0; i<mitad+2; i ++)
                {
                    primeramitad.set(i, numeros.get(i));
                }
                for(int i=mitad+2; i<numeros.size(); i ++)
                {
                    segundamitad.set(i-(mitad+2), numeros.get(i));
                }
                primeramitad=dividir(primeramitad);
                segundamitad=dividir(segundamitad);
                resultado=unir(primeramitad,segundamitad);
                
            }
            return resultado;
        }
    
    public ArrayList<Comparable> unir(ArrayList<Comparable> uno, ArrayList<Comparable> dos){
        ArrayList<Comparable> resultadofinal= new ArrayList<Comparable>();
        int index1=0;
        int index2=0;
        int indexans=0;
        while(index1<uno.size() || index2<dos.size()){
            if(index1<uno.size() && index2<dos.size()){
                int answer = uno.get(index1).compareTo(dos.get(index2));
                if(answer==-1){
                    resultadofinal.set(indexans, dos.get(index2));
                    index2++;
                    indexans++;
                }
                else{
                    resultadofinal.set(indexans, uno.get(index1));
                    index1++;
                    indexans++;
                }
            }
        }
        return resultadofinal;
    }
}
