package lambda;

/**
 * Created by 毕文 on 2018/6/10.
 */
@FunctionalInterface
interface IMath {
    int add(int x, int y);
}

@FunctionalInterface
interface IMath2 {
    int add(int x, int y);
}

public class TypeDemo {

    public static void main(String[] args) {
        // 变量类型定义
        IMath lambda = (x, y) -> x + y;

        // 数组里
        IMath[] lambdas = {(x, y) -> x + y};

        // 强转
        Object lambda2 = (IMath) (x, y) -> x + y;

        // 通过返回类型
        IMath lambda3 = createLamdba();

        TypeDemo typeDemo = new TypeDemo();
        // 当有二义性的时候，使用强制对应的接口解决
        typeDemo.test((IMath2) (x, y) -> x + y);
    }

    public static IMath createLamdba() {
        return (x, y) -> x + y;
    }

    public void test(IMath math) {

    }

    public void test(IMath2 math) {

    }
}
