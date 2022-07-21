package template2;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("Jump가 비활성화 상태입니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn이 비활성화 상태입니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("======== 초보자 레벨 ========");
    }
}
