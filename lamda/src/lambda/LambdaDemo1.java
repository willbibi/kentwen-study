package lambda;

/**
 * Created by 毕文 on 2018/6/9.
 */
@FunctionalInterface
interface Interface1 {
    int doubleNum(int i);

    default int add(int x, int y) {
        return x + y;
    }
}

@FunctionalInterface
interface Interface2 {
    int doubleNum(int i);

    default int add(int x, int y) {
        return x + y;
    }
}

@FunctionalInterface
interface Interface3 extends Interface2, Interface1 {

    @Override
    default int add(int x, int y) {
        return Interface1.super.add(x, y);
    }
}

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 1.
        Interface1 i1 = (i) -> i * 2;
        i1.add(12, 11);
        // 2.常见写法
        Interface1 i2 = i -> 2;

        // 3.
        Interface1 i3 = (int i) -> i * 2;
        // 4.
        Interface1 i4 = (int i) -> {
            return i * 2;
        };
    }
}
