package Practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        if(first<18){
            System.out.println("Подрасти немного");
        }else if (first>=20){
            System.out.println("И 18 норм");
        }
    }
}
