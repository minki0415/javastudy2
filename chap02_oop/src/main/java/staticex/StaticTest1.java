package staticex;

public class StaticTest1 {

    public static void main(String[] args) {
        StaticStudent1 s1 = new StaticStudent1();
        s1.setStudentName("김민기");
        System.out.println(s1.serialNum);
        System.out.println(s1.studentName+ " 학번 : "+s1.studentID);

        StaticStudent1 s2 = new StaticStudent1();
        s2.setStudentName("김동현");
        System.out.println(s2.serialNum);
        System.out.println(s2.studentName+ " 학번 : "+s2.studentID);
    }
}
