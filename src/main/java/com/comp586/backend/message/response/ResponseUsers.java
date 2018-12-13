package com.comp586.backend.message.response;

import com.comp586.backend.model.User;

import java.util.List;

public class ResponseUsers {
    private List<User> userList;

    public ResponseUsers(List<User> a) {
        this.userList = a;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> a) {
        this.userList = a;
    }
}
