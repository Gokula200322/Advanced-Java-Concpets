package ComparableSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main() {

    //    Student s = new Student();

        List<Student> list = new ArrayList<>();
        list.add(new Student("gokula",3,22));
        list.add(new Student("rama",1,23));
        list.add(new Student("srini",4,21));
        list.add(new Student("viji",2,22));


        Collections.sort(list);

        for(Student s : list){
            System.out.println(s);
        }


    }
}
