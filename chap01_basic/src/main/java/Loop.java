public class Loop {

    public static void main(String[] args) {
        // while문
//        int num = 1;
//        int sum = 0;
//        while(num <= 3) {
//            sum+=num;
//            num++;
//            System.out.println(sum);
//        }
//
//        //for문, continue
//        for(int i = 0; i <= 3; i++) {
//            if(i%2 == 0) continue;
//            System.out.println(i*i);
//        }
//
//        //연습문제1
//        int num1 = 10;
//        int num2 = 2;
//        char operator = '-';
//        if(operator == '+') System.out.println(num1+num2);
//        else if (operator == '*') System.out.println(num1*num2);
//        else if (operator == '-') System.out.println(Math.max(num1, num2) - Math.min(num1,num2));
//        else System.out.println(num1/num2);
//
//        //연습문제2
//        for(int i = 1; i < 5 ; i++) {
//            if(i%2 !=0) continue;
//            for(int j = 1; j < 10; j++) {
//                System.out.println(i+" * " +j + " = "+ i*j);
//            }
//        }

        //연습문제4
        int minus = 4;
        int plus = 4;
        for(int i=0; i<4; i++){
            for(int j=1; j<=7; j++){
                if(j >= minus && j <= plus){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
            minus--;
            plus++;
        }

        //연습문제5

        int minus2 = 1;
        int plus2 = 7;
        for(int i=0; i<4; i++){

            for(int j=1; j<=7; j++){
                if (i==0) continue;
                if(j >= minus2 && j <= plus2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            if(i != 0) System.out.println("");
            minus2++;
            plus2--;
        }


    }
}
