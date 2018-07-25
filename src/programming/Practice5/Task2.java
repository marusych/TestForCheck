package programming.Practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer>test = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++) {
            int first = Integer.parseInt(reader.readLine());
            test.add(first);
        }
        System.out.println(test.stream().max(Integer::compare).get());
        System.out.println(test.stream().min(Integer::compare).get());
    }
}
