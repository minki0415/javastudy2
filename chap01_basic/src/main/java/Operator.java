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

    }

}
