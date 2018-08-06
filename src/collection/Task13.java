package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Task13 {
    public static void main(String[] args) throws IOException {
//        Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//        Удалить из множества все числа больше 10.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        while (set.size()<4) {
            try {
                System.out.println("Введите цифру:");
                Integer key = Integer.parseInt(reader.readLine());
                set.add(key);
            }catch (NumberFormatException e){
                System.out.println("Спробуйте ще");
            }
        }
            set.removeIf(t -> t > 10);
        for (Integer f:set) {
            System.out.println(f);
        }

    }
}
