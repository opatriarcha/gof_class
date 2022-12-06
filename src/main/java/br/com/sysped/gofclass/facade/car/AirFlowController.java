package br.com.sysped.gofclass.facade.car;

import java.util.logging.Logger;


public class AirFlowController {

    private static final Logger LOGGER = Logger.getLogger("AirFlowController.class");
    private AirFlowMeter airFlowMeter = new AirFlowMeter();

    public void takeAir() {
        airFlowMeter.getMeasurements();
        LOGGER.info("Air provided!");
    }

    public void off() {
        LOGGER.info("Air controller switched off.");
    }
}
