/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojulian1;

/**
 *
 * @author Oscar
 */
public class Profesor {

    public void ponerNotas(Alumno a) {
        a.getMates().setNota(Math.random() * 10);
        a.getLengua().setNota(Math.random() * 10);
        a.getHistoria().setNota(Math.random() * 10);
    }

    public double calcularMedia(Alumno b) {
        double notaM = b.getMates().getNota();
        double notaL = b.getLengua().getNota();
        double notaH = b.getHistoria().getNota();
        double media = (notaM + notaL + notaH) / 3;
        return media;
    }
}
