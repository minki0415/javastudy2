package stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int sum = Arrays.stream(arr).sum();
        int count = (int) Arrays.stream(arr).count();
        OptionalDouble avg = Arrays.stream(arr).average();
        OptionalInt max = Arrays.stream(arr).max();
        OptionalInt min = Arrays.stream(arr).min();

        System.out.println(sum);
        System.out.println(count);
        System.out.println(avg);
        System.out.println(max);
        System.out.println(min);
    }
}
