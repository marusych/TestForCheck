package programming.Practice3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String s = "asdc dasaYasa. sdtsxcxgh";
        Arrays.asList(s.split(" ")).stream()
                .filter(i->i.length() == Integer.parseInt(Arrays.asList(s.split(" "))
                        .stream().map(z ->z.length()).sorted()
                        .collect(Collectors.toList()).get(s.split(" ").length-1)
                        .toString())).forEach(i -> System.out.println(i+":"+i.length()));

//        List<String> list = Stream.of(str.split(" ")).collect(Collectors.toList());
//        String word = list.get(0);
//        for (int i = 1; i < list.size() ; i++) {
//           if(list.get(i).length()>word.length()) {
//               word=list.get(i);
//           }
//        }
//        System.out.println(word);
//        System.out.println(word.length());


        //Arrays.sort(Stream.of(str.split(" ")).collect(Collectors.toList()).stream().map(i -> i.length()).collect(Collectors.toList()));
        //        String[] chAr = str.split(" ");
//        String ch1 = chAr[0];
//        for(int i=1;i<chAr.length;i++){
//            if(ch1.length()<chAr[i].length())
//                ch1 = chAr[i];
//        }
//
//        System.out.println(ch1);
//        System.out.println(ch1.length());

    }

}
