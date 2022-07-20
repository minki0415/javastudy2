package inheritance;

public class OverridingTest2 {
    public static void main(String[] args) {

        Customer v1 = new VipCustomer(10030,"김찬삼", 12345);
        v1.bonusPoint = 1000;

        int price = 10000;
        System.out.println(v1.getCustomerName() + "님이 지불해야하는 금액은 " + v1.calcPrice(price)+ "원 입니다.");
    }
}
