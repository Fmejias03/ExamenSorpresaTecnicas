package com.company;

public class FarbicaDialogoMac implements Fabrica{
    @Override
    public Boton crearDialogo() {
        return new DialogoMac();
    }

    @Override
    public Caja crearCaja() {
        return new CajaMac();
    }
}
