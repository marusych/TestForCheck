package Practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> test = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++) {
            int first = Integer.parseInt(reader.readLine());
            test.add(first);
        }

        for (int i = 0; i < test.size(); i++) {
            if (test.get(i)>test.get(i+1)){

            }
        }

    }
}
