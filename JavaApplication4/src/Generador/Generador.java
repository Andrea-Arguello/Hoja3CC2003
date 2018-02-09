/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author cooli
 */
public class Generador {

    private static final String FILENAME = "CONCATENAR.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        String numeros="";
        for(int i=0; i<3000; i++){
            numeros+=String.valueOf((int)Math.floor(Math.random()*3000)+1) + "\n";
        }

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String content = numeros;

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(content);


		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

    
    
}
