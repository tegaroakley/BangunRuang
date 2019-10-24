/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan61.bangunruang;

/**
 *
 * @author DRAGON
 */
public class Bola implements Bentuk {
    private double jari;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    

    @Override
    public double hitungVolume() {
        return jari*jari*jari*(4/3)*Math.PI;
    }
    
}
