package br.com.sysped.gofclass.abstractFactory;

/**
 *
 * @author orlando
 */
public class AbstractDesign {

    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.MICRO));
        System.out.println(CarFactory.buildCar(CarType.MINI));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
