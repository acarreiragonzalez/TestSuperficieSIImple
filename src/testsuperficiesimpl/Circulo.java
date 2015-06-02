/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsuperficiesimpl;

/**
 *
 * @author acarreiragonzalez
 */
public class Circulo {

    private float radio;
    private float area;

    public Circulo() {
    }

    public Circulo(float radio, float area) {
        this.radio = radio;
        this.area = area;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
