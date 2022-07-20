package inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        VipCustomer v1 = new VipCustomer(10020, "김유신", 1);
//        v1.setCustomerId(10020);
//        v1.setCustomerName("김유신");
        v1.bonusPoint = 1000;
        System.out.println(v1.showCustomerInfo());
        System.out.println(v1.showVipInfo());
    }
}
