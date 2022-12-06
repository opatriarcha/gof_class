package br.com.sysped.gofclass.facade.car;

import java.util.logging.Logger;

public class FuelInjector {
    private static final Logger LOGGER = Logger.getLogger("FuelInjector.class");

    private FuelPump fuelPump = new FuelPump();

    public void on(){
        LOGGER.info("Fuel injector ready to inject fuel.");
    }

    public void inject() {
        fuelPump.pump();
        LOGGER.info("Fuel injected.");
    }

    public void off() {
        LOGGER.info("Stopping Fuel injector..");
    }
}
