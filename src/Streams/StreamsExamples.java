package Streams;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExamples {

    public static void main() {

        int[] arr = {3,6,1,9,67,45,23,43,89};
        int max = Arrays.stream(arr).max().orElse(0);
        int min = Arrays.stream(arr).min().orElse(0);

        List<Integer> numsList = Arrays.asList(1,4,5,3,7,8,5,4);
        List<Integer> numsList1 =new ArrayList<>(Arrays.asList(1,4,5,3,7,8,5,4));
        int max1 = numsList1.stream().max(Integer::compareTo).orElse(0);

        System.out.println("max value of the arr is "+max);
        System.out.println("max value of the numsList1 is "+max1);
        System.out.println("min value of the arr is "+min);

        numsList1.forEach(n-> System.out.println(n));

        Iterator<Integer> nums = numsList1.iterator();
        while(nums.hasNext()){
            System.out.println(nums.next());
        }

        System.out.println();

        Stream<Integer> s1 = numsList.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0,(c,e) -> c+e);

        System.out.println(result);


        int result1  = numsList.stream()
                       .filter(n -> n%2==0)
                       .map(n -> n*2)
                       .reduce(0,(c,e) -> c+e);

        System.out.println(result1);



        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                if(n%2==0){
                    return true;
                }else{
                    return false;
                }
            }
        };

        Function<Integer,Integer> func = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n*2;
            }
        };

        int result2  = numsList.stream()
                      .filter(p)
                      .map(func)
                      .reduce(0,(c,e) -> c+e);

        System.out.println(result2);

        Stream<Integer> result3  = numsList.stream()
                .filter(p)
                .map(func)
                .sorted();
        result3.forEach(n -> System.out.println(n));
        //System.out.println(result3);

        System.out.println();

        ArrayList<Integer> arrList = new ArrayList<>();
        int size = 10_000;
        Random r = new Random();

        for(int i = 0;i<size;i++ ){
        arrList.add(r.nextInt(100));
        }

        long startSeqTime = System.currentTimeMillis();

        int sum1  = arrList.stream()
                    .filter(n -> n%2==0)
                    .map(n -> n*2)
                    .mapToInt(n->n)
                    .sum();

        long endSeqTime = System.currentTimeMillis();

        long startParallelTime = System.currentTimeMillis();

        int sum2 = arrList.parallelStream()
                   .filter(n -> n%2==0)
                   .map(n -> n*2)
                   .mapToInt(n->n)
                   .sum();

        long endParallelTime = System.currentTimeMillis();

        System.out.println("time for sequential execution ie Normal Stream with single thread "+(endSeqTime-startSeqTime)+" and the sum is "+sum1 );
        System.out.println("time for parallel execution ie  parallelStream with more than one thread "+(endParallelTime-startParallelTime)+" and the sum is "+sum2 );








    }
}
