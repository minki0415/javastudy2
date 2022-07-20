package inheritance;

public class VipCustomer extends Customer {
    private int agentId;
    double saleRatio;

//    public VipCustomer() {
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//        System.out.println("VipCustomer() 생성자 호출");
//    }

    //super 로 접근하고자 하는 생성자
    public VipCustomer(int customerId, String customerName, int agentId) {
        super(customerId, customerName);
        customerGrade= "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentId = agentId;
//        System.out.println("VipCustomer(int, String, int) 생성자 호출");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    public int getAgentId() {
        return agentId;
    }

    public String showVipInfo() {
        return super.showCustomerInfo()+ " 담당 상담원 아이디는" + agentId+ "입니다.";
    }
}
