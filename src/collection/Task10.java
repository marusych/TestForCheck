package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) throws IOException {
//        1. Создай список строк в методе main.
//        2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//        3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.
        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String test = reader.readLine();
            list.add(0,test);
        }
        for (String s: list) {
                System.out.println(s);
        }
    }
}
