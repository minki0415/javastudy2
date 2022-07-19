package singleton;

public class CompanyTest {

    public static void main(String[] args) {
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        //싱글톤으로 정의된 Company 객체는 유일하게 존재하기 때문에 c1과 c2는 동일한 인스턴스를 가진다.
        System.out.println(c1 == c2);
    }
}
