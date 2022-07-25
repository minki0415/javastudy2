package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("a.text");
        }catch (FileNotFoundException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
        //예외 처리 후에도 프로그램이 수행되었음을 알 수 있게 해주는 출력문
        System.out.println("예외 발생으로 인한 프로그램 종료");
    }
}
