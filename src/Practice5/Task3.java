package Practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> test = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int first = Integer.parseInt(reader.readLine());
            test.add(first);
        }

        test.sort(Integer::compareTo);
        System.out.println(test.toString());
        //System.out.println(Arrays.toString(test));

    }
}
