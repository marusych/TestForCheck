package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) throws IOException {

//    Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
//    Вывести на экран список ключей, каждый элемент с новой строки.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<String, String>();
        while (map.size()<10) {
            System.out.println("Введите ключ:");
            String key = reader.readLine();
            System.out.println("Введите значение:");
            String value = reader.readLine();
            map.put(key,value);
        }

        for (Map.Entry<String, String> pair : map.entrySet())

        {

            String key = pair.getKey(); //ключ

            //String value = pair.getValue(); //значение

            System.out.println(key);

        }
    }
}
