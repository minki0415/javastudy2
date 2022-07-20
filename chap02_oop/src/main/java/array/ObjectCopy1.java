package array;

import java.util.Arrays;

public class ObjectCopy1 {

    public static void main(String[] args) {
        Book[] bookArr1 = new Book[3];
        Book[] bookArr2 = new Book[3];

        //얕은복사
        //객체 배열의 요소에 저장된 값은 인스턴스 자체가 아니고 인스턴스의 주소값이다.
        bookArr1[0] = new Book("태백산맥", "조정래");
        bookArr1[1] = new Book("데미안", "헤르만 헤세");
        bookArr1[2] = new Book("어떻게 살 것인가", "유시민");
        System.arraycopy(bookArr1,0,bookArr2,0,3);

        for(int i = 0 ; i < bookArr2.length; i++) {
            bookArr2[i].showBookInfo();
        }
    }

}
