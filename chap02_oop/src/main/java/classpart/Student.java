package classpart;

public class Student {

    //멤버변수
    int studentId; //학번
    private String studentName; //학생이름
    int grade; //학년
    String address; //주소

    Subject korean;
    Subject math;


    public Student(int studentId, String studentName, int grade, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        this.address = address;
    }

    public Student() {};


    public void showStudentInfo() {
        System.out.println(studentName+ ", " + address);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
