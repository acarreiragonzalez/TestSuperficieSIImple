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
public class ControladorTest {
    
    public ControladorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class Controlador.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Controlador.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcC method, of class Controlador.
     */
    @Test
    public void testCalcC() {
        System.out.println("calcC");
        Cuadrado c = null;
        Controlador instance = new Controlador();
        float expResult = 0.0F;
        float result = instance.calcC(c);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcR method, of class Controlador.
     */
    @Test
    public void testCalcR() {
        System.out.println("calcR");
        Rectangulo r = null;
        Controlador instance = new Controlador();
        float expResult = 0.0F;
        float result = instance.calcR(r);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcT method, of class Controlador.
     */
    @Test
    public void testCalcT() {
        System.out.println("calcT");
        Triangulo t = null;
        Controlador instance = new Controlador();
        float expResult = 0.0F;
        float result = instance.calcT(t);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcCir method, of class Controlador.
     */
    @Test
    public void testCalcCir() {
        System.out.println("calcCir");
        Circulo ci = null;
        Controlador instance = new Controlador();
        float expResult = 0.0F;
        float result = instance.calcCir(ci);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
