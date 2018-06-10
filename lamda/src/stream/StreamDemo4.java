package stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by 毕文 on 2018/6/10.
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        String str = "my name is 007";
        // 使用并行流
        str.chars().parallel().forEach(i -> System.out.print((char) i));
        System.out.println();
        //  使用forEachOrdered保证顺序
        str.chars().parallel().forEachOrdered(i -> System.out.print((char) i));

        // 收集到list
        List<String> list = Stream.of(str.split(" ")).collect(Collectors.toList());
        System.out.println(list.size());

        // 使用reduce拼接字符串
        Optional<String> letters = Stream.of(str.split(" ")).reduce((s1, s2) -> s1 + "|" + s2);
        System.out.println(letters.orElse(""));
    }
}
