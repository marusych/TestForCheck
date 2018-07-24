import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.welcome.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Hello hello = new Hello();
        hello.setupName(printHelloName());
        hello.welcome();
        System.out.println("Hello world");
        hello.byeBuy();
    }

    public static String printHelloName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя");
        return reader.readLine();
    }
}
