package com.prototypeShallow;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    private String shopName;

    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    // we create a method to fetch all the data of
    // the books from the data base
    public void loadData(){
        for(int i=1; i<10; i++){
            Book b = new Book();
            b.setBid(i);
            b.setBname("Book "+ i);
            getBooks().add(b);
        }
    }
    // necessary method to clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
