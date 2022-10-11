package com.instant.whatsapp;

public class UserModel {
    private int userImage;
    private String userName;

    public UserModel(int userImage, String userName) {
        this.userImage = userImage;
        this.userName = userName;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
