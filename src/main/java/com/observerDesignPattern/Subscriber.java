package com.observerDesignPattern;

public class Subscriber implements Observer{
    @Override
    public void notified() {
        System.out.println("notification sent!!");
    }
}
