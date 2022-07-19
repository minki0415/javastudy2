package classpart;

public class StudentHidingTest {

    public static void main(String[] args) {
<<<<<<< HEAD

        Student s = new Student();
        //studentName 변수가 Private으로 선언되었기 때문에 외부클래스에서 직접 접근 불가
        //public 메서드인 get, set을 활용하여 접근 가능
        //s.studentName = "kim";
        s.setStudentName("kim");

        System.out.println(s.getStudentName());
=======
        Student s = new Student();
        // studentName 변수가 private 이기 때문에 외부클래스에서 접근 불가하여 생기는 오류
        // s.studentName = "kim";

        s.setStudentName("kim");

        System.out.println(s.getStudentName());

>>>>>>> 34e3cfbfe3a338b09d54d032d4c935e01804b12c
    }

}
