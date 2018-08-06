package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task16 {
    public static void main(String[] args) throws IOException {
//        Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
//        Удалить людей, имеющих одинаковые имена.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<String, String>();
        while (map.size()<5) {
            System.out.println("Введите фамилию:");
            String key = reader.readLine();
            System.out.println("Введите имя:");
            String value = reader.readLine();
            map.put(key,value);
        }
        String name = "";
        for (Map.Entry<String, String> pair : map.entrySet()){
            name = pair.getValue();
        }
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(name))
                map.remove(pair.getKey());
        }

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey(); //ключ
            String value = pair.getValue(); //значение
            System.out.println(key + ":" +value);
        }
    }
}
