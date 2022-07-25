package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer t1 = new TravelCustomer("이순신", 40, 100);
        TravelCustomer t2 = new TravelCustomer("김유신", 25, 100);
        TravelCustomer t3 = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> arr = new ArrayList<>();

        arr.add(t1);
        arr.add(t2);
        arr.add(t3);

        System.out.println("== 고객 명단 추가된 순서대로 출력");
        arr.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));


    }
}
