package abstractclass;

public abstract class Computer {
    //display()와 typing()은 하위 클래스에 따라 구현이 달라질 수 있다.
    //이 두 메서드 구현에 대한 책임을 상속받는 클래스에 위임한다.
    public abstract void display();
    public abstract void typing();
    public void turnOn(){
        System.out.println("전원을 켭니다.");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
