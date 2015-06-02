/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testsuperficiesimpl;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oracle
 */
public class CirculoTest {
    
    public CirculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getRadio method, of class Circulo.
     */
    @Test
    public void testGetRadio() {
        System.out.println("getRadio");
        Circulo instance = new Circulo();
        float expResult = 0.0F;
        float result = instance.getRadio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRadio method, of class Circulo.
     */
    @Test
    public void testSetRadio() {
        System.out.println("setRadio");
        float radio = 0.0F;
        Circulo instance = new Circulo();
        instance.setRadio(radio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class Circulo.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Circulo instance = new Circulo();
        float expResult = 0.0F;
        float result = instance.getArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class Circulo.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        float area = 0.0F;
        Circulo instance = new Circulo();
        instance.setArea(area);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
