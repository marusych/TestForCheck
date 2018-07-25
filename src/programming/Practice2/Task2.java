package programming.Practice2;

public class Task2 {
    public static void main(String[] args) {
        int q = 2355;
        int result = 0;
        String str = Integer.toString(q);
        for (int i = 0; i < str.length(); i++) {
//            int t = Integer.parseInt(String.valueOf(str.charAt(i)));
//            result+=t;
            result += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(result);
    }
}

