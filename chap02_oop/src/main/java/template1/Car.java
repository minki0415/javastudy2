package template1;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    //Template Method Pattern
    //템플릿 메서드는 실행순서, 즉 시나리오를 정의한 메서드이고 바뀌지 않는다.
    //상위 클래스를 상속받은 하위 클래스에서 템플릿 메서드를 재정의하면 안된다.
    //그래서 템플릿 메서드는 final 예약어를 사용하여 선언한다.
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}
