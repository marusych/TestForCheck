package Practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());

        for (int i = 0; i <first; i++) {
            for (int j = 0; j < second; j++) {
                System.out.print(8);
            }
            System.out.println("");
        }
    }
}
