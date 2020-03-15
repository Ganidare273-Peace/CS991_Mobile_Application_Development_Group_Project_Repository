package com.example.tutorprototype1.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Content {

    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.name, item);
    }

    public static class DummyItem {
        public final String name;
        public final String email;
        public final String details;
        public final String extended_details;

        public DummyItem(String name, String email, String details, String extended_details) {
            this.name = name;
            this.email = email;
            this.details = details;
            this.extended_details = extended_details;
        }

}

    static {
        addItem(new DummyItem("Kostas L", "k.liaskos@strath.ac.uk",
                "PhD in Computer Science", "Hi, I'm a lecturer at the University of Strathclyde. My hobby is extreme ironing."));
        addItem(new DummyItem("Sophie P", "sophie_p95@hotmail.com",
                "Masters in Legal Practice", "My name is Sophie and I have lots of spare time to help you with your law studies!"));
        addItem(new DummyItem("Gordon J", "example@email.com",
                "Bachelors in Italian and Japanese", "If you have a domanda or a mondai, I'm the one to ask!"));
        addItem(new DummyItem("Marcus R", "another@email.com",
                "Bachelors in Mechanical Engineering", "Hi, I'm a recent graduate of Glasgow University and I do a lot of Arduino projects!"));
    }
}