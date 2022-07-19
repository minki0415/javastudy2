package classpart;

public class StudentHidingTest {

    public static void main(String[] args) {
        Student s = new Student();
        // studentName 변수가 private 이기 때문에 외부클래스에서 접근 불가하여 생기는 오류
        // s.studentName = "kim";

        s.setStudentName("kim");

        System.out.println(s.getStudentName());

    }

}
