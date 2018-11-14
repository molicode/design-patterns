package com.design.patterns.creational.singleton.examples.government;


public class GovernmentTestDrive {

    public static void main(String[] args) {

        Government governmentOne = Government.getGovernment();
        Government governmentTwo = Government.getGovernment();

        if (governmentOne == governmentTwo) {
            System.out.println("Objects are the same instance");
            System.out.println("    Government one hash code: " + System.identityHashCode(governmentOne));
            System.out.println("    Government two hash code: " + System.identityHashCode(governmentTwo));
        }
    }
}
