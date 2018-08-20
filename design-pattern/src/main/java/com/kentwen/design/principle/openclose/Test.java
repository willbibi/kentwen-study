package com.kentwen.design.principle.openclose;

/**
 * Created by 毕文 on 2018/8/19.
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCrouse = new JavaDiscountCourse(96, "java学习", 348d);
        JavaDiscountCourse course =(JavaDiscountCourse) iCrouse;
        System.out.println("课程id:" + course.getId() + "，课程名称:" + course.getName() + ",课程价格:" + course.getPrice() +",课程原价格:" +course.getOriginPrice());

    }
}
