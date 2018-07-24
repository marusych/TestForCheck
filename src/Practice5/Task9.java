package Practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        int second = Integer.parseInt(reader.readLine());
        int c= 0;
        while (c<second){
            System.out.println(first);
            c++;
        }
    }
}
