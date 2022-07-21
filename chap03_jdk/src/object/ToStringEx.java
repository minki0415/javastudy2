package object;

class Book {
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    //toString 재정의의
   @Override
    public String toString() {
        return bookTitle + ", " + bookNumber;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200, "개미");

        //Object 클래스의 toString() 메서드
        System.out.println(book1);
        System.out.println(book1.toString());


        //String과 Integer 클래스의 toString() 메서드
        //String과 Integer 클래스의 toString() 메서드를 미리 재정의해 두어
        //Object 클래스의 toString()과 다른 형태로 값을 출력한다.
        String str = new String("test");
        Integer i = new Integer(100);

        System.out.println(str);
        System.out.println(i);
        System.out.println(str.toString());
        System.out.println(i.toString());
    }
}
