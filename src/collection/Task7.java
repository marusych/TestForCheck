package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) throws IOException {
//        1. Создай список строк.
//        2. Добавь в него 5 различных строчек.
//        3. Выведи его размер на экран.
//        4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки
        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String test = reader.readLine();
            list.add(test);
        }

        for (String s: list) {
            System.out.println(s);
        }
    }
}
