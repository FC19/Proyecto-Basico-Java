package logica;

import java.lang.System;

import interfaz.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta {


    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y uso placaje");
    }

    @Override
    protected void atacarAraniazo() {

    }

    @Override
    protected void atacarMordisco() {

    }

    @Override
    public void atacarDrenaje() {

    }

    @Override
    public void atacarParalizar() {

    }
}
