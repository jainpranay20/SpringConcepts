package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
         UserDataProvider dataProvider = new UserDatabaseProvider();
         UserManager userManager = new UserManager(dataProvider);
        System.out.println(userManager.getUserInfo());
    }
}
