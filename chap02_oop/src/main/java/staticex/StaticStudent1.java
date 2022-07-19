package staticex;

public class StaticStudent1 {

    public static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public StaticStudent1() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
