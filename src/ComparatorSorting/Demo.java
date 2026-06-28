package ComparatorSorting;

import java.util.*;

// use comparator for multiple ordering ie Multiple sorting strategies ie custom ordering
// and it can exist outside the class or use anonymous inner class and lambda expression.


public class Demo {
    public static void main() {
        // without anonymous inner class or lambda expression
        /*
        class MarksComparator implements Comparator<Student> {

            @Override
            public int compare(Student s1, Student s2) {
                return s1.marks - s2.marks;
            }
        }
        Usage:
        Collections.sort(list, new MarksComparator());
 */


        // for treemap you can only sort the keys
        // if you want to sort a treemap by values convert it to a list of Map type and then do it using comparator
        // we have 3 ways to use comparaotr sorting
        //1. normal  anonymous inner class without lambda expression
        //2.lambda expression and using that comparator obj in collections.sort(list,comp);
        //3. lambda expression but in the collections.sort(list,(a,b)-> { logic }); itself we perform the lambda expression
        // cannot sort - hashmap,linkedhashmap,hastset,linkedhashset but can pass it to list and specify type and sort .



        Map<String,Integer> map = new TreeMap<>();

        map.put("goks",2);
        map.put("rama",1);
        map.put("behzingha",2);
        map.put("srini",3);
        map.put("vijayalakshmi",3);
        map.put("aron",2);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        /*
        Comparator<Map.Entry<String,Integer>> comp = new Comparator<>() {
            public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2) {
                if(o1.getValue().equals(o2.getValue())){
                    return o2.getKey().compareTo(o1.getKey());
                }else{
                    return o1.getValue()-o2.getValue();
                }
            }
        };
        Collections.sort(list,comp);
        */



        /*
        Comparator<Map.Entry<String,Integer>> comp =(o1,o2) -> {
                if(o1.getValue().equals(o2.getValue())){
                    return o2.getKey().compareTo(o1.getKey());
                }else{
                    return o1.getValue()-o2.getValue();
                }
            };
        Collections.sort(list,comp);
        */


        /*
        Collections.sort(list,(o1,o2) ->{
            if(o1.getValue().equals(o2.getValue())){
                return o2.getKey().compareTo(o1.getKey());
            }else{
                return o1.getValue()-o2.getValue();
            }
        });
         */

        for(Map.Entry<String,Integer> m : list){
            System.out.println(m.getKey()+" : " +m.getValue());
        }

    }
}
