package com.design.patterns.behavioral.observer.examples.auction;

import com.design.patterns.behavioral.observer.pattern.Event;
import com.design.patterns.behavioral.observer.pattern.Observer;
import com.design.patterns.behavioral.observer.pattern.Subject;

public class AuctioneerTestDriven {

    public static void main(String[] args) {

        Subject theAuctioneer = new Auctioneer();

        Observer bidderOne = new Bidder();
        Observer bidderTwo = new Bidder();
        Observer bidderThree = new Bidder();

        theAuctioneer.attach(0, bidderOne);
        theAuctioneer.attach(0, bidderTwo);
        theAuctioneer.attach(0, bidderThree);

        theAuctioneer.attach(1, bidderThree);

        Event highBid = new Event(0, "HIGH BID");
        Event lowBid = new Event(1, "LOW BID");

        theAuctioneer.notifyObserver(0, highBid);
        theAuctioneer.notifyObserver(1, lowBid);

    }

}
