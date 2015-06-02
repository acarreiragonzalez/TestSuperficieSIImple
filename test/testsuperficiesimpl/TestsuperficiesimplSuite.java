/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testsuperficiesimpl;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author oracle
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({testsuperficiesimpl.CuadradoTest.class, testsuperficiesimpl.ControladorTest.class, testsuperficiesimpl.VistaTest.class, testsuperficiesimpl.TrianguloTest.class, testsuperficiesimpl.CirculoTest.class, testsuperficiesimpl.RectanguloTest.class})
public class TestsuperficiesimplSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
