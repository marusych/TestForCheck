package exception;

public class Task2 {
    public static void main(String[] args) {
        int w = 33;
        int q = 10;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Result is "+w/q);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Remainder is "+w%q);
    }
}
