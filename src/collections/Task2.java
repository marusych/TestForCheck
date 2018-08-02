package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) throws IOException {
//        Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
//                Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//
//        Пример вывода (тут показана только одна строка):
//        картофель – клубень
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<String, String>();
        while (true) {
            System.out.println("Введите ключ:");
            String key = reader.readLine();
            System.out.println("Введите значение:");
            String value = reader.readLine();
            if (key.equals("end")) {
                break;
            } else {
                map.put(key,value);
            }
        }

        for (Map.Entry<String, String> pair : map.entrySet()) {

            String key = pair.getKey(); //ключ

            String value = pair.getValue(); //значение

            System.out.println(key + ":" + value);

        }
    }
}
