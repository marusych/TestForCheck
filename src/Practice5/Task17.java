package Practice5;

public class Task17 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 31; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
        System.out.println("БУМ!");
    }
}
