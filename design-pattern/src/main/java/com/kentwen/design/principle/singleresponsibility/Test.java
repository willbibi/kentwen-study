package com.kentwen.design.principle.singleresponsibility;

/**
 * Created by 毕文 on 2018/8/19.
 */
public class Test {
    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMethod("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMethod("鸵鸟");
    }
}
