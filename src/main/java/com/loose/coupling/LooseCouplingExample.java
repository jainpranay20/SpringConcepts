package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
         UserDataProvider dataProvider = new UserDatabaseProvider();
         UserManager userManager = new UserManager(dataProvider);
         System.out.println(userManager.getUserInfo());

         // we can create a reference variable of an interface and assign to an object absolutely valid in java
         UserDataProvider webServiceDataProvider = new WebServiceDataProvider();
         UserManager userManager1 = new UserManager(webServiceDataProvider);
         System.out.println(userManager1.getUserInfo());
    }
}
