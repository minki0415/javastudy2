package polymorphism;

public class CustomerTest1 {

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setCustomerId(10001);
        c1.setCustomerName("이순신");
        c1.bonusPoint = 1000;

        System.out.println(c1.showCustomerInfo());

        Customer c2 = new VipCustomer(10002, "김유신", 2000);
        c2.bonusPoint = 1000;

        System.out.println(c2.showCustomerInfo());
        System.out.println("========= 할인율과 보너스 포인트 계산 =========");

        // 상속 관계에 있는 상위 클래스와 하위 클래스는 같은 상위 클래스 자료형으로 선언되어 생성할 수 있지만
        // 재정의된 메서드는 각각 호출될 뿐만 아니라 이름이 같은 메서드가 서로 다른 역할을 구현하고 있음을 알 수 있다.
        int price = 10000;
        int c1Price = c1.calcPrice(price);
        int c2Price = c2.calcPrice(price);

        System.out.println(c1.getCustomerName()+"님이 "+ c1Price +"원 지불하셨습니다.");
        System.out.println(c1.showCustomerInfo());

        System.out.println(c2.getCustomerName()+"님이 "+ c2Price +"원 지불하셨습니다.");
        System.out.println(c2.showCustomerInfo());
    }
}
