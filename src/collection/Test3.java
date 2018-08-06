package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) throws IOException {
//        Есть класс Cat, с полем имя (name, String).
//        Создать коллекцию HashMap<String, Cat>.
//                Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
//                Вывести результат на экран, каждый элемент с новой строки.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Cat> map = new HashMap<String, Cat>();
        while (true) {
            System.out.println("Введите ключ:");
            String key = reader.readLine();
//            System.out.println("Введите значение:");
//            String value = reader.readLine();
            if (key.equals("end")) {
                break;
            } else {
                map.put(key, new Cat(key));
            }
        }
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
