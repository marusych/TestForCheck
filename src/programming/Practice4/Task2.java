package programming.Practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        for (int i = 0; i < 8; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        for (int i = list.length-1; i >= 0; i--) {
            System.out.println(list[i]);
        }

    }
}
