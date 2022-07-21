package interface2;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요");
        System.out.println("R: 순서대로 할당");
        System.out.println("L: 대기가 적은 상담원에게 할당");
        System.out.println("P: 우선순위가 높은 고객부터 할당");

        int ch = System.in.read();
        Scheduler sc = null;

        if(ch == 'r'|| ch == 'R') {
            sc = new RoundRobin();
        } else if(ch == 'l'|| ch == 'L') {
            sc = new LeastJob();
        } else if(ch == 'p'|| ch == 'P') {
            sc = new PriorityAllocation();
        }else {
            System.out.println("다시 입력해주세요");
            return;
        }

        sc.getNextCall();
        sc.sendCallToAgent();
    }
}
