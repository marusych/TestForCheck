package programming.Practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> test = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int first = Integer.parseInt(reader.readLine());
            test.add(first);
        }

        Collections.sort(test, (a, b) -> b.compareTo(a));

        for (int t:test) {
            System.out.println(t);
        }


    }
}
