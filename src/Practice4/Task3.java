package Practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[5];
        String[] text = new String[5];
        for (int i = 0; i < text.length; i++) {
            text[i] = reader.readLine();
        }

        for (int i = 0; i < text.length; i++){
            for (int j = i; j <= i; j++) {
                number[i]=text[j].length();
            }
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

    }
}
