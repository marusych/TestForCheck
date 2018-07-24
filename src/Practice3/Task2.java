package Practice3;

public class Task2 {
    public static void main(String[] args) {
        String str = "asdas dasaYasa. sdtjh34t";
        System.out.println(str.replace(str.substring(str.indexOf(' ')+1, str.lastIndexOf(' ')), "осознаный текст"));
    }
}

