package com.prototypeDeep;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        BookShop bookShop = new BookShop();
        bookShop.setShopName("First shop");
        bookShop.loadData();


        BookShop bookShop1 = (BookShop) bookShop.clone();
        bookShop.getBooks().remove(2);
        bookShop1.setShopName("Second shop");
        System.out.println(bookShop);
        System.out.println(bookShop1);

    }
}
