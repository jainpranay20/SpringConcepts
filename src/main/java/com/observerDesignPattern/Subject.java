package com.observerDesignPattern;

public interface Subject {

    void subscribe(Observer ob);

    void unSubscribe(Observer ob);

    void notifyChanges(Observer ob);
}
