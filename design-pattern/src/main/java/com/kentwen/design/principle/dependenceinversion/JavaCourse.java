package com.kentwen.design.principle.dependenceinversion;

/**
 * Created by 毕文 on 2018/8/19.
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("kent 在学习Java课程");
    }
}
