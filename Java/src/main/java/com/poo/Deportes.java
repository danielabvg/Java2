package com.poo;

public class Deportes {

    private String nombreDeporte;
    private int duracionMinutos;

    public Deportes(String nombreDeporte, int duracionMinutos) {
        this.nombreDeporte = nombreDeporte;
        this.duracionMinutos = duracionMinutos;
    }

    public void mostrarActividad() {
        System.out.println("Deporte: " + nombreDeporte +
                " | Duración: " + duracionMinutos + " minutos");
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }
}

// La clase Deportes representa un deporte que un alumno puede practicar.
//Tiene dos atributos: el nombre del deporte y la duración en minutos.
//Incluye un constructor para crear el deporte y un metodo mostrarActividad()
// que imprime su información.

