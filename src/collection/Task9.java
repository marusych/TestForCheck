package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) throws IOException {
//        1. Создай список строк.
//        2. Считай с клавиатуры 5 строк и добавь в список.
//        3. Используя цикл, найди самую короткую строку в списке.
//        4. Выведи найденную строку на экран.
//        5. Если таких строк несколько, выведи каждую с новой строки
        String min = "";
        List<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String test = reader.readLine();
            list.add(test);
        }
        for (int i = 0; i < list.size()-1; i++) {
            min = list.get(0);
            if(list.get(i).length()<=min.length()){
                min = list.get(i);
            }
        }
        for (String s: list) {
            if(s.length()==min.length()){
                System.out.println(s);
            }
        }
    }
}
