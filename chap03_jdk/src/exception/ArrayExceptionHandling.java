package exception;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
       int[] arr = new int[5];

       // 반복문이 배열의 범위를 초과하므로 예외 발생
       try{
           for(int i = 0 ; i <= 5 ; i++) {
               arr[i] = i;
               System.out.println(arr[i]);
           }
       }catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(e);
           System.out.println("예외처리 부분");
       }
        System.out.println("프로그램 종료");
    }
}