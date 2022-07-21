package abstractclass;

//MyNoteBook은 모든 추상 메서드가 구현된 클래스이므로 abstract 예약어를 사용하지 않습니다.
public class MyNoteBook extends NoteBook{
    @Override
    public void typing() {
        System.out.println("MyNoteBook typing()");
    }
}
