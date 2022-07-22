package object;

class Student {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString() {
        return studentId + ", " + studentName;
    }

    //equals() 메서드 재정의
    //재정의한 equals() 메서드는 학생의 학번이 같으면 true 반환
   @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student std = (Student)obj;
            if(this.studentId == std.studentId) return true;
            else return false;
        }
        return false;
    }
}

public class EqualsTest {
    public static void main(String[] args) {

        //Object의 equals() 메서드의 원래 기능은 두 인스턴스의 주소를 비교하는 것이다.
        Student s1 = new Student(100, "이상원");
        Student s2 = s1;
        Student s3 = new Student(100, "이상원");

        if(s1 == s2) System.out.println("s1 == s2");
        else System.out.println("s1 != s2");

        if(s1.equals(s2)) System.out.println("s1 == s2");
        else System.out.println("s1 != s2");

        if(s1 == s3) System.out.println("s1 == s2");
        else System.out.println("s1 != s2");

        if(s1.equals(s3)) System.out.println("s1 == s2");
        else System.out.println("s1 != s2");


        //String 과 Integer의 equals() 메서드
        String str1 = new String("abc"); // 두 인스턴스의 주소 값이 같은지 비교하여 출력
        String str2 = new String("abc"); // String 클래스의 equals() 메서드 사용용
       System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        Integer i1 = new Integer(3);
        Integer i2 = new Integer(3);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));


    }
}
