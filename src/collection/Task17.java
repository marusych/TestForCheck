package collection;

import java.util.HashMap;
import java.util.Map;

public class Task17 {
    public static void main(String[] args) {
//        1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
//        2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
//        3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
//        4. Вывести содержимое Map на экран.
        Map<String, String> map = new HashMap<>();
        map.put("Test","resr1");
        map.put("Test2","resr1");
        map.put("Test3","rrr");
        map.put("Test4","fff");
        map.put("Test","bbb");
        map.put("Test2","vvv");
        map.put("Test5","mmm");
        map.put("Test6","ooo");
        map.put("Test7","kkk");
        map.put("Test8","ppp");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey(); //ключ
            String value = pair.getValue(); //значение
            System.out.println(key + ":" +value);
        }
    }
}
