/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsuperficiesimpl;

import javax.swing.JOptionPane;

/**
 *
 * @author acarreiragonzalez
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista v = new Vista();
        Controlador c = new Controlador();
        String fig = v.pedirFigura();

        if (fig.equals("cuadrado")) {
            v.imprimir(c.calcC(new Cuadrado()));
        } else {
            if (fig.equals("rectangulo")) {
                v.imprimir(c.calcR(new Rectangulo()));
            } else {
                if (fig.equals("triangulo")) {
                    v.imprimir(c.calcT(new Triangulo()));
                } else {
                    if (fig.equals("circulo")) {
                        v.imprimir(c.calcCir(new Circulo()));
                    } else {
                        JOptionPane.showMessageDialog(null, fig + " non é unha figura válida");
                    }
                }
            }
        }
    }

    public float calcC(Cuadrado c) {

        Vista v = new Vista();
   
        c.setArea(c.getLado() * c.getLado());
        return c.getArea();
    }

    public float calcR(Rectangulo r) {

        Vista v = new Vista();
        v.pedirDatosR(r);
        r.setArea(r.getAlto() * r.getLargo());
        return r.getArea();
    }

    public float calcT(Triangulo t) {

        Vista v = new Vista();
        v.pedirDatosT(t);
        t.setArea((t.getBase() * t.getAltura()) / 2);
        return t.getArea();
    }

    public float calcCir(Circulo ci) {

        Vista v = new Vista();
        v.pedirDatosCir(ci);
        ci.setArea((ci.getRadio() * ci.getRadio()) * 3.14f);
        return ci.getArea();
    }
}
