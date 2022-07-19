package staticex;

public class StaticTest2 {

    public static void main(String[] args) {
        StaticStudent2 s1 = new StaticStudent2();
        s1.setStudentName("김민기");
        System.out.println(StaticStudent2.getSerialNum());
        System.out.println(s1.studentName+ " 학번 : "+s1.studentID);

        StaticStudent2 s2 = new StaticStudent2();
        s2.setStudentName("김동현");
        System.out.println(StaticStudent2.getSerialNum());
        System.out.println(s2.studentName+ " 학번 : "+s2.studentID);
    }
}
