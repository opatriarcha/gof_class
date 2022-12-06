package br.com.sysped.gofclass.facade.car;

import java.util.logging.Logger;


public class TemperatureSensor {
    private static final Logger LOGGER = Logger.getLogger("TemperatureSensor.class");

    public void getTemperature(){
        LOGGER.info("Getting temperature from the sensor..");
    }

}
