package array;

public class ObjectCopy2 {

    public static void main(String[] args) {
        Book[] bookArr1 = new Book[3];
        Book[] bookArr2 = new Book[3];

        //깊은복사
        //복사한 배열 요소는 기존 배열 요소와 서로 다른 인스턴스를 가리키므로
        //기존 배열의 요소 값이 변경되어도 영향받지 않음
        bookArr1[0] = new Book("태백산맥", "조정래");
        bookArr1[1] = new Book("데미안", "헤르만 헤세");
        bookArr1[2] = new Book("어떻게 살 것인가", "유시민");

        bookArr2[0] = new Book();
        bookArr2[1] = new Book();
        bookArr2[2] = new Book();

        for(int i = 0 ; i < bookArr1.length;i++) {
            bookArr2[i].setBookName(bookArr1[i].getBookName());
            bookArr2[i].setAuthor(bookArr1[i].getAuthor());
        }

        for(int i = 0 ; i < bookArr2.length; i++) {
            bookArr2[i].showBookInfo();
        }

        //bookArr1 제목, 작가 변경
        bookArr1[0].setBookName("나목");
        bookArr1[0].setAuthor("박완서");

        System.out.println("-------------bookArr1-------------");
        for(int i =0; i < bookArr1.length; i++) {
            bookArr1[i].showBookInfo();
        }

        System.out.println("-------------bookArr2-------------");
        for(int i =0; i < bookArr2.length; i++) {
            bookArr2[i].showBookInfo();
        }

        System.out.println("-------------Enhanced For Loop-------------");
        for(Book x : bookArr1) {
            x.showBookInfo();
        }

    }

}
