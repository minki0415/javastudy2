package polymorphism;

import java.util.ArrayList;

public class CustomerTest2 {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer c1 = new Customer(1001, "이순신");
        Customer c2 = new Customer(1002, "신사임당");
        Customer c3 = new GoldCustomer(1003, "홍길동");
        Customer c4 = new GoldCustomer(1004, "이율곡");
        Customer c5 = new VipCustomer(1005, "김유신", 2000);

        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
        customerList.add(c5);

        System.out.println("========== 고객정보 출력 ==========");
        for(Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("========== 할인율과 보너스 포인트 출력 ==========");
        int price = 10000;
        for(Customer c : customerList) {
            int cost = c.calcPrice(price);
            System.out.println(c.getCustomerName()+" 님이 "+ cost + "원 지불하셨습니다.");
            System.out.println(c.getCustomerName()+" 님의 현재 보너스 포인트는 " + c.bonusPoint+"점 입니다.");
        }
    }
}
