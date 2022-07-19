package classpart;

class Birthday {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void PrintThis() {
        System.out.println(this);
    }
}


public class ThisExample {
    public static void main(String[] args) {
        Birthday day = new Birthday();
        day.setYear(2000);
        System.out.println(day);
        day.PrintThis();
    }


}
