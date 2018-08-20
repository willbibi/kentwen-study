package com.kentwen.design.principle.dependenceinversion;

/**
 * Created by 毕文 on 2018/8/19.
 */
public class Kent {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

//    public Kent(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }

    public void studyCourse() {
        iCourse.studyCourse();
    }


}
