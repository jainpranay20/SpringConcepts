package com.loose.coupling;


// Let's added all the code use to interact with the db

// Tommorrow if the DB changes suppose
// A - MySQL, PostgresSQL
public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User Details From Database";
    }
}
