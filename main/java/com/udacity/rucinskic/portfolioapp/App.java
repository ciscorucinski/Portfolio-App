package com.udacity.rucinskic.portfolioapp;

import java.util.HashMap;

public enum App {

    ONE         (1, "Spotify Streamer"),
    TWO         (2, "Scores App"),
    THREE       (3, "Library App"),
    FOUR        (4, "Build It Bigger"),
    FIVE        (5, "XYX Reader"),
    CAPSTONE    (6, "???");

    private String name;
    private int number;
    private static final HashMap<Integer, App> map;

    static {

        map = new HashMap<>();
        for (App app: App.values()) { map.put(app.number, app); }

    }

    App(int number, String name) {

        this.number = number;
        this.name = name;

    }

    static App get(int app) { return map.get(app); }

    public int getAppNumber() { return this.number; }

    @Override
    public String toString() { return this.name; }


}
