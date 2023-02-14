package com.company;

public class FabricaDialogoMac implements Fabrica{
    @Override
    public Boton crearDialogo() {
        return new DialogoMac();
    }

    @Override
    public Caja crearCaja() {
        return new CajaMac();
    }


}
