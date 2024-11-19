package com.builderDesignPattern;

public class Main {
    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setUserId("1")
                .setUserName("pranay")
                .build();

        System.out.println(user);

        User anuj = new User.UserBuilder()
                .setEmailId("anuj")
                .build();
        System.out.println(anuj);

    }
}
