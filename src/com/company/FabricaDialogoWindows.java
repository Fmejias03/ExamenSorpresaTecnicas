package com.company;

public abstract class FabricaDialogoWindows implements Fabrica{
    @Override
    public Boton crearDialogo() {
        return new DialogoWindows();
    }

    @Override
    public Caja crearCaja() {
        return new CajaWindows();
    }
}
