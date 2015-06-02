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
public class TrianguloTest {
    
    public TrianguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getBase method, of class Triangulo.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Triangulo instance = new Triangulo();
        float expResult = 0.0F;
        float result = instance.getBase();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class Triangulo.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        float base = 0.0F;
        Triangulo instance = new Triangulo();
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class Triangulo.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Triangulo instance = new Triangulo();
        float expResult = 0.0F;
        float result = instance.getAltura();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltura method, of class Triangulo.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        float altura = 0.0F;
        Triangulo instance = new Triangulo();
        instance.setAltura(altura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class Triangulo.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Triangulo instance = new Triangulo();
        float expResult = 0.0F;
        float result = instance.getArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class Triangulo.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        float area = 0.0F;
        Triangulo instance = new Triangulo();
        instance.setArea(area);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
