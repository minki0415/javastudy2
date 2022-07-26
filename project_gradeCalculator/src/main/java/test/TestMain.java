package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {
    School goodSchool = School.getInstance();
    Subject korean;
    Subject math;
    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.createSubject();
        test.createStudent();

        String report = test.gradeReport.getReport();
        System.out.println(report);
    }

    public void createSubject() {
        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학", Define.MATH);

        goodSchool.addSubject(korean);
        goodSchool.addSubject(math);
    }

    public void createStudent() {
        Student s1 = new Student(181243, "안성원", korean);
        Student s2 = new Student(181518, "오태훈", math);
        Student s3 = new Student(171235, "이성호", korean);
        Student s4 = new Student(171288, "조세원", korean);
        Student s5 = new Student(173362, "최태평", math);

        goodSchool.addStudent(s1);
        goodSchool.addStudent(s2);
        goodSchool.addStudent(s3);
        goodSchool.addStudent(s4);
        goodSchool.addStudent(s5);

        korean.register(s1);
        korean.register(s2);
        korean.register(s3);
        korean.register(s4);
        korean.register(s5);

        math.register(s1);
        math.register(s2);
        math.register(s3);
        math.register(s4);
        math.register(s5);

        addScoreForStudent(s1, korean, 95);
        addScoreForStudent(s1, math, 83);

        addScoreForStudent(s2, korean, 71);
        addScoreForStudent(s2, math, 100);

        addScoreForStudent(s3, korean, 95);
        addScoreForStudent(s3, math, 97);

        addScoreForStudent(s4, korean, 90);
        addScoreForStudent(s4, math, 72);

        addScoreForStudent(s5, korean, 53);
        addScoreForStudent(s5, math, 21);
    }

    public void addScoreForStudent(Student student, Subject subject, int point) {
        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);
    }
}
