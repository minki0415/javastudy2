public class Variable {

    public static void main(String[] args) {

        int level;              //정수형 변수 level을 선언
        level = 10;             //level 변수에 10을 대입
        System.out.println(level);


        int level2 = 10;           //level 변수 선언과 동시에 값을 대입
        System.out.println(level2);


        //int num1 = 12345678900;
        long num2 = 12345678900L;
        long num3 = 1000;

        System.out.println(num2 + num3);

        double dnum = 1;

        for(int i=0; i<10000; i++){
            dnum = dnum + 0.1;
        }
        System.out.println(dnum);

        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(iNum);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum);
    }
}
