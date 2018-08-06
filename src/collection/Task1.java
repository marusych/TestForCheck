package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) throws IOException {
//        Создать коллекцию HashSet с типом элементов String.
//                Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
//                Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//        Посмотреть, как изменился порядок добавленных элементов.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<String>();
        while (true) {
            String first = reader.readLine();
            if (first.equals("end")) {
                break;
            } else {
                set.add(first);
            }
        }
        set.stream().forEach(i -> System.out.println(i));
    }
}
