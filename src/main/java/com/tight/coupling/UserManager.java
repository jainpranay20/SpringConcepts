package com.tight.coupling;

public class UserManager {

    //TIGHTLY COUPLING as if the db changes then we have to make the changes here also in User manager class also
    private UserDatabase userDatabase = new UserDatabase();
    public String getUserInfo() {
        return userDatabase.getUserDetails();
    }
}
