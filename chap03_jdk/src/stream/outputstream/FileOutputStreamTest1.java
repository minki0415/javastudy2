package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(65);
            fos.write(65);
            fos.write(65);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");
    }
}
