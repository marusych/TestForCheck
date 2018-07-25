package programming.Practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        int[] smallArray1 = new int[5];
        int[] smallArray2 = new int[5];
        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < list.length; i++) {
            if (i < list.length / 2) {
                smallArray1[i] = list[i];
                System.out.println(smallArray1[i]);
            } else {
                smallArray2[i - list.length / 2] = list[i];
                System.out.println(smallArray2[i - list.length / 2]);
            }

        }


    }
}
