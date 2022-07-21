package interface1;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        CompleteCalculator c = new CompleteCalculator();
        System.out.println(c.add(num1, num2));
        System.out.println(c.substract(num1, num2));
        System.out.println(c.times(num1, num2));
        System.out.println(c.divide(num1, num2));
        c.showInfo();
        c.description();

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Calc.total(arr));

        //Calc형으로 선언한 변수에서 사용할 수 있는 메서드는
        //Calc 인터페이스에 선언한 메서드 뿐이다.
        //Calc calc = c;
        //calc.~
    }
}
