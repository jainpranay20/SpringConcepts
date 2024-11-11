package com.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{


    List<Observer> users = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        users.add(ob);
    }

    @Override
    public void unSubscribe(Observer ob) {
        users.remove(ob);
    }

    @Override
    public void notifyChanges(Observer ob) {
        for(Observer obj: this.users){
            obj.notified();
        }
    }
}
