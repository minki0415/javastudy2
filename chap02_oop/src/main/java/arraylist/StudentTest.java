package arraylist;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "Lee");
        s1.addSubject("국어", 100);
        s1.addSubject("수학", 82);

        Student s2 = new Student(1002, "Kim");
        s2.addSubject("국어", 90);
        s2.addSubject("수학", 91);

        Student s3 = new Student(1003, "Park");
        s3.addSubject("국어", 88);
        s3.addSubject("수학", 96);

        s1.showStudentInfo();
        System.out.println("---------------------------------------");
        s2.showStudentInfo();
        System.out.println("---------------------------------------");
        s3.showStudentInfo();
    }
}
