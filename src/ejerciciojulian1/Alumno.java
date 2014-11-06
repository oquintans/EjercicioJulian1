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
public class Alumno {

    private Asignatura mates;
    private Asignatura lengua;
    private Asignatura historia;

    public Alumno() {

    }

    public Alumno(Asignatura m, Asignatura lengua, Asignatura h) {

        mates = m;
        this.lengua = lengua;
        historia = h;
    }

    public Alumno(int idMates, int idLengua, int idHistoria) {
        mates = new Asignatura(idMates);
        lengua = new Asignatura(idLengua);
        historia = new Asignatura(idHistoria);
    }

    public Asignatura getMates() {
        return mates;
    }

    public Asignatura getLengua() {
        return lengua;
    }

    public Asignatura getHistoria() {
        return historia;
    }
}
