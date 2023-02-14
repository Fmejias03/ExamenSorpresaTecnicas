package com.company;

import static org.junit.jupiter.api.Assertions.*;

class FabricaDialogoWindowsTest {

@org.junit.jupiter.api.Test
    void crearBoton() {
        FabricaDialogoWindows fabricaDialogo = new FabricaDialogoWindows();
        Boton boton = fabricaDialogo.crearDialogo();
        boton.mostrar();
    }

    @org.junit.jupiter.api.Test
    void crearCaja() {
        FabricaDialogoWindows fabricaDialogo = new FabricaDialogoWindows();
        Caja caja = fabricaDialogo.crearCaja();
        caja.mostrar();
    }

    @org.junit.jupiter.api.Test
    void crearBotonCaja() {
        FabricaDialogoWindows fabricaDialogo = new FabricaDialogoWindows();
        Boton boton = fabricaDialogo.crearDialogo();
        Caja caja = fabricaDialogo.crearCaja();
        boton.mostrar();
        caja.mostrar();
    }

    @org.junit.jupiter.api.Test
    void crearCajaBoton() {
        FabricaDialogoWindows fabricaDialogo = new FabricaDialogoWindows();
        Caja caja = fabricaDialogo.crearCaja();
        Boton boton = fabricaDialogo.crearDialogo();
        boton.mostrar();
        caja.mostrar();
    }

    @org.junit.jupiter.api.Test
    void main() {
        FabricaDialogoWindows fabricaDialogo = new FabricaDialogoWindows();
        Boton boton = fabricaDialogo.crearDialogo();
        Caja caja = fabricaDialogo.crearCaja();
        boton.mostrar();
        caja.mostrar();
    }

}