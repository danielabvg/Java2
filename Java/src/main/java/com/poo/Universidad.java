package com.poo;

public class Universidad {

    public static void main(String[] args) {

        // Crear deportes
        Deportes futbol = new Deportes("Fútbol", 90);
        Deportes natacion = new Deportes("Natación", 60);

        // Crear primer alumno
        Alumno alumno1 = new Alumno("A001", "Juan");
        alumno1.inscripcionCurso();
        alumno1.asignarDeporte(futbol);
        alumno1.mostrarDeporte();

        System.out.println("****************************************");

        // Crear segundo alumno
        Alumno alumno2 = new Alumno("A002", "Maria");
        alumno2.inscripcionCurso();
        alumno2.asignarDeporte(natacion);
        alumno2.mostrarDeporte();

        System.out.println("****************************************");

        //Invocar método estático de Docente
        Docente.asignarCalificacion();
    }
}

// La clase Universidad contiene el metodo main, o sea, es donde se ejecuta el programa.
//Aquí se crean los alumnos, se crean los deportes, se asignan, y se muestran los
// resultados en pantalla.
