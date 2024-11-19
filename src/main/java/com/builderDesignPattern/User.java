package com.builderDesignPattern;

public class User {

    private final String userId;
    private final String userName;
    private final String emailId;
    // Created a private constructor such that we will not call the
    // constructor directly
    private User(UserBuilder userBuilder) {
        // initialise
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.emailId = userBuilder.emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return userName + emailId + userId;
    }

    // inner class to create object
    static class UserBuilder{
        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder() {

        }

        // we have take method as user-builder instead of void such that
        // we call the same method again
        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }

    }
}
