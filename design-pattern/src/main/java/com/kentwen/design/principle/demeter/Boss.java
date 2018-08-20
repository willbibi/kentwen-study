package com.kentwen.design.principle.demeter;

/**
 * Created by 毕文 on 2018/8/19.
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}
