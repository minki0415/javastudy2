package staticex;

public class StaticTest {

    public static void main(String[] args) {
        StaticStudent s1 = new StaticStudent();
        s1.setStudentName("김민기");
        System.out.println(s1.serialNum);
        s1.serialNum++;

        StaticStudent s2 = new StaticStudent();
        s2.setStudentName("김동현");
        System.out.println(s1.serialNum);
        System.out.println(s2.serialNum);
    }
}
