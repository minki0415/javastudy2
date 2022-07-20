package inheritance;

public class OverridingTest3 {
    public static void main(String[] args) {

        int price = 10000;

        Customer c1 = new Customer(10010, "이순신");
        System.out.println(c1.getCustomerName() + "님이 지불해야하는 금액은 " + c1.calcPrice(price)+ "원 입니다.");

        VipCustomer v1 = new VipCustomer(10020,"김동현", 12345);
        System.out.println(v1.getCustomerName() + "님이 지불해야하는 금액은 " + v1.calcPrice(price)+ "원 입니다.");


        // v2.calcPrice()가 호출되면, v2변수를 선언할 때 사용한 자료형 Customer의 메서드가 호출되는 것이 아니라
        // 생성된 인스턴스 VipCustomer의 메서드가 호출된다.
        // 이를 가상 메서드라고 한다. 자바의 모든 메서드는 가상 메서드이다.
        Customer v2 = new VipCustomer(10030,"김찬삼", 12346);
        System.out.println(v2.getCustomerName() + "님이 지불해야하는 금액은 " + v2.calcPrice(price)+ "원 입니다.");
    }
}
