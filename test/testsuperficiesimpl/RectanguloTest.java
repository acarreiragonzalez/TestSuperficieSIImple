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
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAlto method, of class Rectangulo.
     */
    @Test
    public void testGetAlto() {
        System.out.println("getAlto");
        Rectangulo instance = new Rectangulo();
        float expResult = 0.0F;
        float result = instance.getAlto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlto method, of class Rectangulo.
     */
    @Test
    public void testSetAlto() {
        System.out.println("setAlto");
        float alto = 0.0F;
        Rectangulo instance = new Rectangulo();
        instance.setAlto(alto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLargo method, of class Rectangulo.
     */
    @Test
    public void testGetLargo() {
        System.out.println("getLargo");
        Rectangulo instance = new Rectangulo();
        float expResult = 0.0F;
        float result = instance.getLargo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLargo method, of class Rectangulo.
     */
    @Test
    public void testSetLargo() {
        System.out.println("setLargo");
        float largo = 0.0F;
        Rectangulo instance = new Rectangulo();
        instance.setLargo(largo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class Rectangulo.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Rectangulo instance = new Rectangulo();
        float expResult = 0.0F;
        float result = instance.getArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class Rectangulo.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        float area = 0.0F;
        Rectangulo instance = new Rectangulo();
        instance.setArea(area);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
