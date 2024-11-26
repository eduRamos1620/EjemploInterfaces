package com.eduardo.poointerfaces.imprenta;

import com.eduardo.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Juan", "Sistemas", "EStudiante de sistemas......");
        cv.addExperiencia("Java");
        cv.addExperiencia("Python");
        cv.addExperiencia("Spring");
        cv.addExperiencia("Django");

        Libro libro = new Libro("Toño", "Los aliens existen", Genero.Suspenso);
        libro.addPagina(new Pagina("Sirenas"))
                .addPagina(new Pagina("Pulpos"))
                .addPagina(new Pagina("Animales extraños"))
                .addPagina(new Pagina("Bombas nucleares???"));

        Informe info = new Informe("Los extraterrestres vienen del oceano", "Juan", "Jaime Mausan");

        imprimir(cv);
        imprimir(info);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
