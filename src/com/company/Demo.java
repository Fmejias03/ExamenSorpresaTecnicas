package com.company;

public class Demo {
    private static Cliente configureApplication() {
        Cliente app;
        Fabrica factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new FabricaDialogoMac();
        } else {
            factory = new FabricaDialogoWindows() {
            };
        }
        app = new Cliente(factory);
        return app;
    }

    public static void main(String[] args) {
        Cliente app = configureApplication();
        app.mostrar();
    }


}

