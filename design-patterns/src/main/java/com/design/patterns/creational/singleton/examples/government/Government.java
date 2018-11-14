package com.design.patterns.creational.singleton.examples.government;

public class Government {

    static Government government;

    private Government() {};

    public static void setGovernment(Government government) {
        Government.government = government;
    }

    /**
     * The instance gets created only when it is called for first time.
     * Lazy-loading.
     * This way singleton is thread-safe
     *
     * @return
     */
    public synchronized static Government getGovernment() {
        if (government == null) {
            government = new Government();
        }
        return government;
    }





}
