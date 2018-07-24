package Practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int secret;
        secret = random.nextInt(20 + 1);
        int c=0;
        while (c<7){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int first = Integer.parseInt(reader.readLine());
            if(first<secret){
                System.out.println("Мало");
            }else if(first>secret){
                System.out.println("Много");
            }else if (first==secret){
                System.out.println("Угадал");
                break;
            }
            c++;
            if(c==7){
                System.out.println("Не угадал");
                break;
            }
        }
    }
}
