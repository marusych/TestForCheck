package programming.Practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOne = reader.readLine();
        String nameTwo = reader.readLine();
        if(nameOne.equals(nameTwo)){
            System.out.println("Имена идентичны");
        }else if(nameOne.length()==nameTwo.length()){
            System.out.println("Длины имен равны");
        }
    }
}
