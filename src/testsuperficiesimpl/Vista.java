/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsuperficiesimpl;

import javax.swing.JOptionPane;
import testsuperficiesimpl.Circulo;
import testsuperficiesimpl.Cuadrado;
import testsuperficiesimpl.Rectangulo;
import testsuperficiesimpl.Triangulo;

/**
 *
 * @author acarreiragonzalez
 */
public class Vista {

    public String pedirFigura() {
        String respuesta;
        respuesta = JOptionPane.showInputDialog("De que figura queres calcular a area? \ncuadrado \ncirculo \ntriangulo \nrectangulo");
        JOptionPane.showMessageDialog(null, "Elexiches  " + respuesta);
        return respuesta;
    }

    public void pedirDatosC(Cuadrado c) {
        float lado = Float.parseFloat(JOptionPane.showInputDialog("Lado? "));
        c.setLado(lado);
    }

    public void pedirDatosR(Rectangulo r) {
        float alto = Float.parseFloat(JOptionPane.showInputDialog("Altura? "));
        float largo = Float.parseFloat(JOptionPane.showInputDialog("Lonxitude? "));
        r.setAlto(alto);
        r.setLargo(largo);
    }

    public void pedirDatosT(Triangulo t) {
        float base = Float.parseFloat(JOptionPane.showInputDialog("Base? "));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura? "));
        t.setBase(base);
        t.setAltura(altura);
    }

    public void pedirDatosCir(Circulo c) {
        float radio = Float.parseFloat(JOptionPane.showInputDialog("Radio? "));
        c.setRadio(radio);
    }

    public void imprimir(float area) {
        JOptionPane.showMessageDialog(null, "A área é  " + area);
    }
}
