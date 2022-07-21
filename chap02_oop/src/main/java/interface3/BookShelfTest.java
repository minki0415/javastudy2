package interface3;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue sq = new BookShelf();
        sq.enQueue("태백산맥1");
        sq.enQueue("태백산맥2");
        sq.enQueue("태백산맥3");

        System.out.println(sq.deQueue());
        System.out.println(sq.deQueue());
        System.out.println(sq.deQueue());
    }
}
