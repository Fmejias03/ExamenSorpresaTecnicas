package com.company;

public class Cliente {
    private Dialogo dialogo;
    private Caja caja;

    public Cliente(Fabrica fabrica) {
        dialogo = fabrica.crearDialogo();
        caja = fabrica.crearCaja();
    }

    public void mostrar() {
        dialogo.mostrar();
        caja.mostrar();
    }

}
