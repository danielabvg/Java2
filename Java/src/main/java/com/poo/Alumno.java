package com.poo;

public class Alumno {

    private String matricula;
    private String nombre;
    private Deportes deporte; // ← Nuevo atributo

    // Constructor vacío
    public Alumno() {
    }

    // Constructor con parámetros
    public Alumno(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public void inscripcionCurso() {
        System.out.println("El alumno " + nombre + " se ha inscrito");
    }

    public double pagoMensualidad() {
        return 1500.00;
    }

    public int calcularHorasEstudio(int horasPorDia, int diasSemana) {
        return horasPorDia * diasSemana;
    }

    // Nuevo método para asignar deporte
    public void asignarDeporte(Deportes deporte) {
        this.deporte = deporte;
    }

    // Mostrar deporte asignado
    public void mostrarDeporte() {
        if (deporte != null) {
            System.out.print("Deporte asignado a " + nombre + ": ");
            deporte.mostrarActividad();
        } else {
            System.out.println(nombre + " no tiene deporte asignado.");
        }
    }
}

// La clase Alumno representa a un estudiante.
//Guarda su matrícula, nombre, y su deporte asignado.
//Incluye métodos para inscribirse, calcular horas de estudio, asignar un deporte y mostrarlo.

