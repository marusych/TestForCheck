package exception;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        int w = 33;
        int q = 10;
        Thread.sleep(3000);
        System.out.println("Result is "+w/q);
        Thread.sleep(3000);
        System.out.println("Remainder is "+w%q);
        try {
            int zero = 5 / 0;
        }catch (ArithmeticException e){
            System.out.println("You shall not fall!");
        }

    }
}
