package com.eduardo.poointerfaces.imprenta;

import com.eduardo.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Juan", "Sistemas", "EStudiante de sistemas......");
        cv.addExperiencia("Java");
        cv.addExperiencia("Python");
        cv.addExperiencia("Spring");
        cv.addExperiencia("Django");

        Informe info = new Informe("Los extraterrestres vienen del oceano", "Juan", "Jaime Mausan");

        imprimir(cv);
        imprimir(info);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
