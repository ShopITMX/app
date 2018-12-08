package com.shopit.shopit.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DummyContent {

    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        addItem(new DummyItem("10", "Coca Cola", "Coca Cola","$8.00"));
        addItem(new DummyItem("21 kg", "Wilson NFL Super Grip Fútbol", "Wilson NFL Super Grip Fútbol","$240.00"));
        addItem(new DummyItem("3", "Vichy Ideal Soleil Protector Solar Toque Seco FPS 50", "Vichy Ideal Soleil Protector Solar Toque Seco FPS 50","$78.00"));
        addItem(new DummyItem("4", "Puma Mantra FUSEFIT Unrest 955", "Puma Mantra FUSEFIT Unrest 955","$11986.99"));
        addItem(new DummyItem("10", "Coca Cola Light", "Coca Cola","$8000.00"));
        addItem(new DummyItem("10", "Coca Cola Light", "Coca Cola","8.00"));
        addItem(new DummyItem("10", "Coca Cola Light", "Coca Cola","8.00"));
        addItem(new DummyItem("10", "Coca Cola Light", "Coca Cola","8.00"));
        addItem(new DummyItem("10", "Coca Cola Light", "Coca Cola","8.00"));
        addItem(new DummyItem("10", "Coca Cola Light", "Coca Cola","8.00"));
        addItem(new DummyItem("10", "Coca Cola Light", "Coca Cola","8.00"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final String price;

        public DummyItem(String id, String content, String details, String price) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.price = price;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
