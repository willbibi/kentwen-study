package lambda;

import java.util.stream.IntStream;

/**
 * Created by KENT on 2018-06-09.
 */
public class MiniDemo {
    public static void main(String[] args) {

        // 告诉程序怎么做
        int[] nums = {2, 33, 44, 55, -90, -66, -55};
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);

        // jdk8
        int min2 = IntStream.of(nums).parallel().min().getAsInt();
        System.out.println(min2);
    }
}
