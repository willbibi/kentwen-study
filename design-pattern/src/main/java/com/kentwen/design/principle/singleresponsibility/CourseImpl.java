package com.kentwen.design.principle.singleresponsibility;

/**
 * Created by 毕文 on 2018/8/19.
 */
public class CourseImpl implements ICourseContent, ICourseManager {
    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }
}
