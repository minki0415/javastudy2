package inheritance;

public class OverridingTest1 {
    public static void main(String[] args) {
        Customer c1 = new Customer(10010, "이순신");
        c1.bonusPoint = 1000;

        VipCustomer v1 = new VipCustomer(10020,"김민기", 12345);
        v1.bonusPoint = 1000;

        int price = 10000;
        System.out.println(c1.getCustomerName() + "님이 지불해야하는 금액은 " + c1.calcPrice(price)+ "원 입니다.");
        System.out.println(v1.getCustomerName() + "님이 지불해야하는 금액은 " + v1.calcPrice(price)+ "원 입니다.");
    }
}
