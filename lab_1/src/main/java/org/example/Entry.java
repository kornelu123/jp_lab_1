package org.example;

import java.util.HashMap;
import java.util.TreeMap;

public class Entry {
    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Entry(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
