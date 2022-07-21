package template1;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("===== 자율주행하는 자동차 =====");
        Car c1 = new AiCar();
        c1.run();

        System.out.println("===== 사람이 운전하는 자동차 =====");
        Car c2 = new ManualCar();
        c2.run();
    }
}
