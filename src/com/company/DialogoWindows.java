package com.company;

public class DialogoWindows extends FabricaDialogoWindows implements Dialogo{

        @Override
        public void mostrar() {
            System.out.println("Mostrando dialogo en Windows");
        }
}
