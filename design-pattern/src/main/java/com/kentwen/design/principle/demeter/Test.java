package com.kentwen.design.principle.demeter;

/**
 * Created by 毕文 on 2018/8/19.
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
