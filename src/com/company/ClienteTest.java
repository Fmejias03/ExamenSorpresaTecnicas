package com.company;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @org.junit.jupiter.api.Test
    void main() {
        Caja caja = new CajaMac();
        Boton boton = new DialogoMac();
        boton.mostrar();
        caja.mostrar();
    }

}