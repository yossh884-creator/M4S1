package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        // Creamos un objeto simple
        Persona persona = new Persona("Yoss", 20, "México");

        // Creamos el objeto Gson
        Gson gson = new Gson();

        // Convertimos el objeto a formato JSON
        String json = gson.toJson(persona);
        System.out.println("Objeto convertido a JSON:");
        System.out.println(json);
        System.out.println("ESTO ES NUEVO, LO AABO DE AGREGAR.  hola ARASAM SAM SAM SAM CURI CURI");
        // Convertimos el JSON de vuelta a objeto
        Persona persona2 = gson.fromJson(json, Persona.class);
        System.out.println("\nJSON convertido de nuevo a objeto:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("País: " + persona2.getPais());
    }
}

// Clase auxiliar
class Persona {
    private String nombre;
    private int edad;
    private String pais;

    public Persona(String nombre, int edad, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getPais() { return pais; }
}