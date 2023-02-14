package com.company;

import static org.junit.jupiter.api.Assertions.*;

class FarbicaDialogoMacTest {

    @org.junit.jupiter.api.Test
    void crearBoton() {
        FabricaDialogoMac fabricaDialogo = new FabricaDialogoMac();
        Boton boton = fabricaDialogo.crearDialogo();
        boton.mostrar();
    }

    @org.junit.jupiter.api.Test
    void crearCaja() {
        FabricaDialogoMac fabricaDialogo = new FabricaDialogoMac();
        Caja caja = fabricaDialogo.crearCaja();
        caja.mostrar();
    }

    @org.junit.jupiter.api.Test
    void crearBotonCaja() {
        FabricaDialogoMac fabricaDialogo = new FabricaDialogoMac();
        Boton boton = fabricaDialogo.crearDialogo();
        Caja caja = fabricaDialogo.crearCaja();
        boton.mostrar();
        caja.mostrar();
    }

    @org.junit.jupiter.api.Test
    void crearCajaBoton() {
        FabricaDialogoMac fabricaDialogo = new FabricaDialogoMac();
        Caja caja = fabricaDialogo.crearCaja();
        Boton boton = fabricaDialogo.crearDialogo();
        boton.mostrar();
        caja.mostrar();
    }

    @org.junit.jupiter.api.Test
    void main() {
        FabricaDialogoMac fabricaDialogo = new FabricaDialogoMac();
        Boton boton = fabricaDialogo.crearDialogo();
        Caja caja = fabricaDialogo.crearCaja();
        boton.mostrar();
        caja.mostrar();
    }

}