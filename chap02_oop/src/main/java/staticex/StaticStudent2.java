package staticex;

public class StaticStudent2 {

    private static int serialNum = 1000;
    int studentID;
    String studentName;
    int grade;
    String address;

    public StaticStudent2() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        StaticStudent2.serialNum = serialNum;
    }
}
