package Practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
        }
        for (int i = list.length-1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}
