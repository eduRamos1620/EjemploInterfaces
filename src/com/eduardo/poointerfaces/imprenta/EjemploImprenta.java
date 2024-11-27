package com.eduardo.poointerfaces.imprenta;

import com.eduardo.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("Juan", "Perez"), "Sistemas",
                "EStudiante de sistemas......");
        cv.addExperiencia("Java");
        cv.addExperiencia("Python");
        cv.addExperiencia("Spring");
        cv.addExperiencia("Django");

        Libro libro = new Libro(new Persona("Toño", "Sanchez"), "Los aliens existen", Genero.Suspenso);
        libro.addPagina(new Pagina("Sirenas"))
                .addPagina(new Pagina("Pulpos"))
                .addPagina(new Pagina("Animales extraños"))
                .addPagina(new Pagina("Bombas nucleares???"));

        Informe info = new Informe("Los extraterrestres vienen del oceano",
                new Persona("Juan", "Perez"), new Persona("Jaime", "Mausan"));

        Imprimible.imprimir(cv);
        Imprimible.imprimir(info);
        Imprimible.imprimir(libro);
    }


}
