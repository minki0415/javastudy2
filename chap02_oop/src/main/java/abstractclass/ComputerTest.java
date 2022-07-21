package abstractclass;

public class ComputerTest {
    public static void main(String[] args) {
        //Computer c1 = new Computer(); //추상 클래스는 메서드가 구현되어 있지 않으므로 수행할 수 있는 내용이 없고, 따라서 인스턴스로 만들 수 없다.
        Computer c2 = new DeskTop();
        //Computer c3 = new NoteBook();
        Computer c4 = new MyNoteBook();
    }
}

//추상클래스는 상속을 하기 위해 만든 클래스
//실제 하위 클래스에서 내용을 각각 다르게 구현해야 한다면, 구현내용을 추상 메서드로 남겨두고 하위 클래스에 구현을 위임한다.
//구현된 메서드 : 하위 클래스에서 공통으로 사용할 구현코드, 하위클래스에서 재정의 할 수도 있음
//추상 메서드 : 하위 클래스가 어떤 클래스냐에 따라 구현 코드가 달라짐