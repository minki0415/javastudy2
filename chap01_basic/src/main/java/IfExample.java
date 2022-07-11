public class IfExample {

    public static void main(String[] args) {

        // 조건문
        int age = 7;
        if (age >= 8) {
            System.out.println("학교에 다닙니다.");
        } else {
            System.out.printf("%d년 후에 학교에 갑니다.\n", 8 - age);
        }

    }
}
