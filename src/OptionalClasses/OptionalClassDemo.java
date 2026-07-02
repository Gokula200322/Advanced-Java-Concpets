package OptionalClasses;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassDemo {
    public static void main() {

        List<String> list1 = new ArrayList<>(Arrays.asList("gokula","rama","srinivasan","viji"));
        List<String> list2 = Arrays.asList("aron","vidhya","nesan","karthi");
       String name1 = list1.stream().filter(str -> str.contains("am")).findFirst().orElse("not found");
       Optional<String> name2 = list1.stream().filter(str -> str.contains("al")).findFirst();

        System.out.println(name1);

       if(name2.isPresent()){
           System.out.println(name2.get());
       }else{
           System.out.println("not found");
       }

    }
}
