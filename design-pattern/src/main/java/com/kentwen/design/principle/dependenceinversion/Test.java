package com.kentwen.design.principle.dependenceinversion;

/**
 * Created by 毕文 on 2018/8/19.
 */
public class Test {
// v1
//    public static void main(String[] args) {
//        Kent kent = new Kent();
//        kent.studyJavaCourse();
//        kent.studyFECourse();
//    }

//    v2
//    public static void main(String[] args) {
//        Kent kent = new Kent();
//        kent.studyCourse(new JavaCourse());
//        kent.studyCourse(new FECourse());
//        kent.studyCourse(new PythonCourse());
//    }

    // v3
//    public static void main(String[] args) {
//        Kent kent = new Kent(new JavaCourse());
//        kent.studyCourse();
//    }

    public static void main(String[] args) {
        Kent kent = new Kent();
        kent.setiCourse(new JavaCourse());
        kent.studyCourse();

        kent.setiCourse(new FECourse());
        kent.studyCourse();
    }

}
