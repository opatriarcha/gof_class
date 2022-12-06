package br.com.sysped.gofclass.facade.car;

import java.util.logging.Logger;

public class CatalyticConverter {

    private static final Logger LOGGER = Logger.getLogger("CatalyticConverter.class");

    public void on() {
        LOGGER.info("Catalytic Converter switched on!");
    }

    public void off() {
        LOGGER.info("Catalytic Converter switched off!");
    }
}
