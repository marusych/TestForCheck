package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task11 {
    public static void main(String[] args) throws IOException {
//        1. Создай список строк.
//        2. Добавь в него 5 строчек с клавиатуры.
//        3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
//        4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки
        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String test = reader.readLine();
            list.add(test);
        }
        for (int i = 0; i < 13 ; i++) {
            list.add(0, list.get(list.size()-1));
            list.remove(list.size() - 1);
        }
        for (String s: list) {
            System.out.println(s);
        }
    }
}
