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
public class Kerucut implements Bentuk{
    private double jari;
    private double tinggi;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    
    @Override
    public double hitungVolume() {
        return (1/3)*jari*jari*Math.PI*tinggi;
    }
    
}
