package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task14 {
    public static void main(String[] args) throws IOException {
//        Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
//        Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<String, String>();
        String name = "TestName";
        String lastName = "TestLName";
        while (map.size()<5) {
            System.out.println("Введите фамилию:");
            String key = reader.readLine();
            System.out.println("Введите имя:");
            String value = reader.readLine();
            map.put(key,value);
        }
        int countFirstName=0;
        int countLastName=0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (key.equals(name))
            {
                countFirstName++;
            }

            String value  = pair.getValue();
            if (value.equals(lastName))
            {
                countLastName++;
            }
        }
        System.out.println("имя " + countFirstName);
        System.out.println("фамилия " + countLastName);

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey(); //ключ
            String value = pair.getValue(); //значение
            System.out.println(key + ":" +value);
        }
    }
}
