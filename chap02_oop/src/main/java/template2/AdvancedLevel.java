package template2;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프합니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn이 비활성화 상태입니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("======== 중급자 레벨 ========");
    }
}
