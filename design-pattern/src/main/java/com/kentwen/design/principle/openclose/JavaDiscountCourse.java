package com.kentwen.design.principle.openclose;

/**
 * Created by 毕文 on 2018/8/19.
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

}
