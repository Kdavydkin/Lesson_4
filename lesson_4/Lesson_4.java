package ru.geekbrains.lesson_4;

import java.util.*;

public class Lesson_4 {
    public static void main(String[] args) {
        String[] words = {"day", "sun", "dog", "frog", "table", "chair", "meal", "gas", "car", "smartphone"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "89219988654");
        pb.add("Petrov", "89267485612");
        pb.add("Sidorov", "89111145876");
        pb.add("Sidorov", "88002257575");

        System.out.println(pb.get("Sidorov"));
    }
}
