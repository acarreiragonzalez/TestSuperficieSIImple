/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsuperficiesimpl;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import testsuperficiesimpl.Controlador;
import testsuperficiesimpl.Cuadrado;

/**
 *
 * @author acarreiragonzalez
 */
@RunWith(Parameterized.class)
public class CuadradoTest {

    private float ladoo, area;
    private Controlador con;
    private Cuadrado c;

    public CuadradoTest(float l, float a) {
        this.area = a;
        this.ladoo = l;
        c = new Cuadrado(l, 0);
    }

    @Before
    public void initialize() {
        con = new Controlador();
    }

    /**
     * Test of main method, of class Controlador.
     */
    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {3, 9},
            {4, 22},
            {100, 1},
            {7, 2}
        });
    }

    @Test
    public void testMain() {
        System.out.println("Parameterized Number is : " + ladoo + " ---> " + area);
        assertEquals(area,
                con.calcC(c), 0.0);
    }

}
