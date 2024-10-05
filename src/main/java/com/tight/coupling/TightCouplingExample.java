package com.tight.coupling;

public class TightCouplingExample {
    public static void main(String[] args) {
         UserManager userManager = new UserManager();
         userManager.getUserInfo();
    }
}
