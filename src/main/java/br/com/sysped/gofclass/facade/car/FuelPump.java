package br.com.sysped.gofclass.facade.car;

import java.util.logging.Logger;

public class FuelPump {

    private static final Logger LOGGER = Logger.getLogger("FuelPump.class");

    public void pump() {
        LOGGER.info("Fuel Pump is pumping fuel..");
    }
}
