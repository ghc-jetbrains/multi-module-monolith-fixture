package com.example.module079;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Auto-generated Service25 in module-079.
 * Repro fixture only - do not edit.
 */
public class Service25 {
    private final String name = "Service25@module-079";
    private final List<String> items = new ArrayList<>();
    private final Map<String, Integer> counters = new HashMap<>();

    public String getName() {
        return name;
    }

    public void addItem(String item) {
        items.add(item);
        counters.merge(item, 1, Integer::sum);
    }

    public int countOf(String item) {
        return counters.getOrDefault(item, 0);
    }

    public int compute1(int x) {
        int acc = 0;
        for (int i = 0; i < x; i++) {
            acc += i * 1;
        }
        return acc;
    }

    public int compute2(int x) {
        int acc = 0;
        for (int i = 0; i < x; i++) {
            acc += i * 2;
        }
        return acc;
    }

    public int compute3(int x) {
        int acc = 0;
        for (int i = 0; i < x; i++) {
            acc += i * 3;
        }
        return acc;
    }

    public int compute4(int x) {
        int acc = 0;
        for (int i = 0; i < x; i++) {
            acc += i * 4;
        }
        return acc;
    }
}
