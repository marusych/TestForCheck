package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task15 {
    public static void main(String[] args) throws IOException {
//        Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
//        Удалить из словаря всех людей, родившихся летом.
        Map<String, Date> map = new HashMap<String, Date>();
        map.put("AAA", new Date("JUNE 28 1984"));
        map.put("SSS", new Date("APR 29 1992"));
        map.put("RRR", new Date("DEC 11 1959"));
        map.put("FFF", new Date("JUNE 9 1980"));
        map.put("GGG", new Date("JUNE 5 1980"));
        map.put("HHH", new Date("JUNE 28 1980"));
        map.put("BBB", new Date("JUNE 2 1980"));
        map.put("VVV", new Date("JUNE 4 1980"));
        map.put("CCC", new Date("JUNE 6 1980"));

        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String,Date> pair = iterator.next();
            Date value = pair.getValue();
            int rad = value.getMonth();
            if(rad == 5 || rad == 6 || rad == 7)
                iterator.remove();
        }
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            String key = pair.getKey(); //ключ
            int rad = pair.getValue().getMonth(); //значение
            System.out.println(key + ":" +rad);
        }
    }
}
