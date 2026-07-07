package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MethodReference {
    public static void main() {

        int[] arr = {3,6,1,9,67,45,23,43,89};
        // here no need of max logic as we use arr to stream convertion which returns an IntStream
        // and the IntStream class has an inbuilt max function which finds the max
        int max = Arrays.stream(arr).max().orElse(0);

        IntStream arr1= Arrays.stream(arr);

        // arr1.forEach(n-> System.out.print(n+" "));
         arr1.forEach(System.out::println);
        // after printing the stream we cannot convert it back to arr
       // int[] arr2 = arr1.toArray();

       // for(int n : arr2){
       //     System.out.print(n+" ");
       // }
        // again after converting the arr to IntStream
        // and then converting it back to arr then the IntStream is gone so we cannot print max as its gone
        // so again we need to form the stream and then only we can print max;
        //System.out.println(max);

        System.out.println();


        List<Integer> numsList = Arrays.asList(1,4,5,3,7,8,5,4);
        // here we need the max logic bc list to stream which returns a Stream<Integer>
        // so we need to use comparator and perform finding max logic
        // it can be lambda expression, or labda through function name as in max3 or use methodReference
        int max1 = numsList.stream().max(Integer::compareTo).orElse(0);
        int max2 = numsList.stream().max((a,b) -> {return a-b;}).orElse(0);
        int max3 = numsList.stream().max((a,b) -> a.compareTo(b)).orElse(0);


        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);

      //  Stream<Integer> s = numsList.stream().filter().map().reduce();
        // print method ref


    }
}
