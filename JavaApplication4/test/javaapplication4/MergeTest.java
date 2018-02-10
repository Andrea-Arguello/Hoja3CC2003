/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author massa
 */
public class MergeTest {
    
    public MergeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dividir method, of class Merge.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        ArrayList<Comparable> numeros = null;
        Merge instance = new Merge();
        ArrayList<Comparable> expResult = null;
        ArrayList<Comparable> result = instance.dividir(numeros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unir method, of class Merge.
     */
    @Test
    public void testUnir() {
        System.out.println("unir");
        ArrayList<Comparable> uno = null;
        ArrayList<Comparable> dos = null;
        Merge instance = new Merge();
        ArrayList<Comparable> expResult = null;
        ArrayList<Comparable> result = instance.unir(uno, dos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
