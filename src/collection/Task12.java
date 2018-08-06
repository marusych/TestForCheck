package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Task12 {
    public static void main(String[] args) throws IOException {
//        Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<String>();
        while (set.size()<5) {
            System.out.println("Введите слово на Л:");
            String key = reader.readLine();
            if(key.substring(0,1).equalsIgnoreCase("л")) {
                set.add(key);
            }else{
                System.out.println("Упс, слово не начинается на Л");
            }
        }
        for (String f:set) {
            System.out.println(f);
        }
    }
}
