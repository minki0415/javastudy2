package cooperation;

public class TakeTrans {

    public static void main(String[] args) {

        Student s1 = new Student("James", 5000);
        Student s2 = new Student("Tomas", 10000);

        Bus b1 = new Bus(100);
        s1.takeBus(b1);
        s1.showInfo();
        b1.showInfo();

        Subway sub1 = new Subway("2호선");
        s2.takeSubway(sub1);
        s2.showInfo();
        sub1.showInfo();

    }

}
