package programming.Practice3;

public class Task1 {
    public static void main(String[] args) {
        String str = "asdas dasaYasa. sdtjh34t";
        System.out.println("First symbol - " + str.substring(1,2));
        System.out.println("Last symbol - " + str.substring(str.length()-1));
        if(str.length()%2==0){
            System.out.println("Average symbol - " + str.substring(str.length()/2-1,str.length()/2));
        }
        System.out.println("Text to the point - "+ "\"" +str.substring(0,str.lastIndexOf(".")+1) + "\"");
        int result = 0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)==' '){
                result++;
            }
        }
        System.out.println("Count of spaces is " + result);
    }
}
