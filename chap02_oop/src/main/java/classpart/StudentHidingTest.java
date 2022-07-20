package classpart;

public class StudentHidingTest {

    public static void main(String[] args) {

        Student s = new Student();
        //studentName 변수가 Private으로 선언되었기 때문에 외부클래스에서 직접 접근 불가
        //public 메서드인 get, set을 활용하여 접근 가능
        //s.studentName = "kim";
        s.setStudentName("kim");

        System.out.println(s.getStudentName());

    }

}
