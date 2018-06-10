package lambda;

import java.util.function.*;

/**
 * Created by 毕文 on 2018/6/10.
 */
class Dog {
    private String name = "哮天犬";

    private int food = 10;

    public Dog() {
    }

    /**
     * 带参数的构造函数
     *
     * @param name
     */
    public Dog(String name) {
        this.name = name;
    }

    /**
     * 狗叫，静态方法
     *
     * @param dog
     */
    public static void bark(Dog dog) {
        System.out.println(dog + "叫了");
    }

    /**
     * 吃狗粮
     * JDK默认会把当前实例传入到非静态方法，参数名为this,位置是第一个
     *
     * @param num
     * @return 剩下多少斤
     */
    public int eat(int num) {
        System.out.println("吃了" + num + "斤");
        this.food -= num;
        return this.food;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class MethodReferenceDemo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(1);
        // 1.方法引用
        // 当函数执行体里只有一个函数调用，而且函数的参数和箭头左边是一样，可以缩写成方法引用
        Consumer<String> consumer = System.out::println;
        consumer.accept("接收的数据");

        // 2.静态方法的方法引用
        Consumer<Dog> consumer1 = Dog::bark;

        consumer1.accept(dog);

        // 3.非静态方法，使用对象实例的方法引用
//        Function<Integer, Integer> function = dog::eat;
//        UnaryOperator<Integer> function = dog::eat;
        IntUnaryOperator function = dog::eat;
        System.out.println("还剩下" + function.applyAsInt(2) + "斤");

        // 4.使用类名方法来引用
        BiFunction<Dog, Integer, Integer> eatFunction = Dog::eat;
        System.out.println("还剩下" + eatFunction.apply(dog, 2) + "斤");

        // 5.构造函数引用
        Supplier<Dog> supplier = Dog::new;
        System.out.println("创建了新对象：" + supplier.get());

        // 带参数的构造函数引用
        Function<String, Dog> function1 = Dog::new;
        System.out.println("创建了新对象：" + function1.apply("柴犬"));
    }
}
