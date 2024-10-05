package com.tight.coupling;


// Let's added all the code use to interact with the db

// Tommorrow if the DB changes suppose
// A - MySQL, PostgresSQL
public class UserDatabase {

    public String getUserDetails() {
        return "User Details From Database";
    }
}
