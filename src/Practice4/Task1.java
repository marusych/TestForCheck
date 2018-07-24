package Practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        System.out.println(max(list));
    }
     public static int max (int [] array){
        int max = array[0];
         for (int i = 1; i < array.length; i++) {
             if(max<array[i]){
                 max=array[i];
             }
         }
        return max;
     }
}

