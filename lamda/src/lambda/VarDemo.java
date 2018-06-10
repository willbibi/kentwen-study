package lambda;

import java.util.function.Consumer;

/**
 * Created by 毕文 on 2018/6/10.
 */
public class VarDemo {
    public static void main(String[] args) {
        // 匿名类引用外面的必须为final
        // java中的是传值，并不是传引用
        // 默认为final,不能被修改
        String str = "world";
        Consumer<String> consumer = s -> System.out.println(s + str);
        consumer.accept("hello ");
    }
}
