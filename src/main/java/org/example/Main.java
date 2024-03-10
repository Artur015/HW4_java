package org.example;

import org.example.gb_collections.GbList;
import org.example.gb_collections.lists.GbArrayList;

public class Main {
    public static void main(String[] args) {
        GbList<Integer> list = new GbArrayList<>();
        list.add(5);
        list.add(9);
        list.add(66);

        System.out.println(list.size());
        System.out.println(list);
        list.removeByIndex(1);
        list.remove(66);
        System.out.println(list);
    }
}