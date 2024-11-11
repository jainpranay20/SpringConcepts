package com.observerDesignPattern;

public class Demo {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber pranay = new Subscriber();

        channel.subscribe(pranay);

        channel.notifyChanges(pranay);
    }
}
