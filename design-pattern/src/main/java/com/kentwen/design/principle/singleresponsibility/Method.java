package com.kentwen.design.principle.singleresponsibility;

/**
 * Created by 毕文 on 2018/8/19.
 */
public class Method {

    private void updateUserInfo(String username, String address) {
        username = "kent";
        address = "shenzhen";
    }

    private void updateUserInfo(String username, String... properties) {
        username = "kent";
    }

    private void updateUsername(String username) {
        username = "kent";
    }

    private void updateUserAddress(String address) {
        address = "shenzhen";
    }

    private void updateUserInfo(String username, String address, boolean bool) {
        if (bool) {
            //todo
        } else {
            //todo
        }
        username = "kent";
        address = "shenzhen";
    }
}
