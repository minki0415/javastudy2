public class Operator {

    public static void main(String[] args) {

        int mathScore = 90;
        int engScore = 70;

        int totalScore = mathScore + engScore;

        double avgScore = totalScore/2.0;

        System.out.println(totalScore);
        System.out.println(avgScore);

        int gameScore = 150;

        int lastScore1 = ++gameScore;
        int lastScore2 = --gameScore;

        System.out.println(lastScore1);
        System.out.println(lastScore2);

        int myAge = 17;
        boolean value = (myAge > 25);
        System.out.println(value);

        int num = 10;
        boolean isEven;
        isEven = (num%2 == 0) ? true : false;
        System.out.println(isEven);

        //비트연산자
        //&
        int a = 5, b = 10;
        int result = a & b;
        System.out.println(result); // 00000101 + 00001010 = 00000000, & -> 각 자리수가 둘다 1일 경우에만 1

    }

}
