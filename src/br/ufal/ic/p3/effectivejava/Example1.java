package br.ufal.ic.p3.effectivejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Welcome");
        words.add("To");
        words.add("Effective");
        words.add("Java");

        // Old way
        Collections.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        // New way
        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // Best way
        Collections.sort(words, Comparator.comparingInt(String::length));

        // Top Way
        words.sort(Comparator.comparingInt(String::length));
    }
}
