package singleton;

public class CarFactoryTest {

    public static void main(String[] args) {
        CarFactory carFactory = CarFactory.getInstance();
        Car sonata = carFactory.createCar();
        Car pony = carFactory.createCar();

        System.out.println(sonata.getCarNum());
        System.out.println(pony.getCarNum());
    }



}
