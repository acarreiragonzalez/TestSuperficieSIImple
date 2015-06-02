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
public class VistaTest {
    
    public VistaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of pedirFigura method, of class Vista.
     */
    @Test
    public void testPedirFigura() {
        System.out.println("pedirFigura");
        Vista instance = new Vista();
        String expResult = "";
        String result = instance.pedirFigura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirDatosC method, of class Vista.
     */
    @Test
    public void testPedirDatosC() {
        System.out.println("pedirDatosC");
        Cuadrado c = null;
        Vista instance = new Vista();
        instance.pedirDatosC(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirDatosR method, of class Vista.
     */
    @Test
    public void testPedirDatosR() {
        System.out.println("pedirDatosR");
        Rectangulo r = null;
        Vista instance = new Vista();
        instance.pedirDatosR(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirDatosT method, of class Vista.
     */
    @Test
    public void testPedirDatosT() {
        System.out.println("pedirDatosT");
        Triangulo t = null;
        Vista instance = new Vista();
        instance.pedirDatosT(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirDatosCir method, of class Vista.
     */
    @Test
    public void testPedirDatosCir() {
        System.out.println("pedirDatosCir");
        Circulo c = null;
        Vista instance = new Vista();
        instance.pedirDatosCir(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class Vista.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        float area = 0.0F;
        Vista instance = new Vista();
        instance.imprimir(area);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
