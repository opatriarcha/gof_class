package br.com.sysped.gofclass.facade.car;

import java.util.logging.Logger;

public class Radiator {

    private static final Logger LOGGER = Logger.getLogger("Radiator.class");

    public void on(){
        LOGGER.info("Radiator switched on!");
    }

    public void off(){
        LOGGER.info("Radiator switched off!");
    }

    public void setSpeed(Integer speed){
        LOGGER.info("Setting radiator speed to " + speed);
    }
}
