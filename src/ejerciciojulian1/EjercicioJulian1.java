/*
Desarrollar una clase llamada Asignatura que:

Tenga dos atributos private de tipo int (el identificador) y de tipo double (la calificación).
Tenga un constructor con un parámetro de tipo int.
Tenga un getter para cada uno de los atributos.
Tenga un setter para la calificación.

Desarrollar una clase llamada Alumno que:

Tenga tres atributos private de tipo Asignatura.
Tenga un constructor con tres parámetros de tipo Asignatura que inicialice los tres atributos.
Tenga un constructor con tres parámetros de tipo int que inicialice los tres atributos.
Tenga un getter para cada uno de los atributos.

Desarrollar una clase llamada Profesor que:

Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que no devuelve nada. Pondrá una calificación aleatoria a cada una de las asignaturas del alumno. 
Tenga un método calcularMedia que recibe un parámetro de tipo Alumno y devuelve un double.

Desarrollar una clase llamada Actividad1 que en su método main:

Cree e inicialice tres Asignaturas.
Cree un Alumno con las tres Asignaturas.
Cree un Profesor que le ponga calificaciones al Alumno y muestre por pantalla la media del Alumno.

Nota: Para calcular un número aleatorio usaremos Math.random() que devuelve un double entre 0.0 y 1.0
 */
package ejerciciojulian1;

public class EjercicioJulian1 {

    public static void main(String[] args) {
        Asignatura asg1=new Asignatura();
        Asignatura asg2=new Asignatura();
        Asignatura asg3=new Asignatura();
        
        Alumno alm= new Alumno(asg1,asg2,asg3);
        Profesor prf=new Profesor();
        prf.ponerNotas(alm);
        
        System.out.println("Nota Media Asignaturas= "+prf.calcularMedia(alm));

    }

}
