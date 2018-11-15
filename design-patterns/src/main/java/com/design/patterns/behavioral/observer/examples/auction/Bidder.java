package com.design.patterns.behavioral.observer.examples.auction;

import com.design.patterns.behavioral.observer.pattern.Event;
import com.design.patterns.behavioral.observer.pattern.Observer;

public class Bidder implements Observer {

    private static int ID = 0;

    @Override
    public void update(Event event) {
        System.out.println(
                "ID: " + (++ID) +
                        ", Updating event type: " + event.getType() +
                        ", Event description: " + event.getDescription());
    }
}
