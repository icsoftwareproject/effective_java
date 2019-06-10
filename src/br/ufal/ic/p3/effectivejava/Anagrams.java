package br.ufal.ic.p3.effectivejava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {

    public static void main(String[] args) {
        // Version Without Stream
//        File dictionary = new File(args[0]);
//        int minGroupSize = Integer.parseInt(args[1]);
//        Map<String, Set<String>> groups = new HashMap<>();
//        try (Scanner s = new Scanner(dictionary)) {
//            while (s.hasNext()) {
//                String word = s.next();
//                groups.computeIfAbsent(alphabetize(word), (unused) -> new TreeSet<>()).add(word);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        Path dictionary = Paths.get(args[0]);
        int minGroupSize = Integer.parseInt(args[1]);
        // Stream Version
        try (Stream<String> words = Files.lines(dictionary)) {
            words.collect(Collectors.groupingBy(word -> alphabetize(word)))
                    .values().stream()
                    .filter(group -> group.size() >= minGroupSize)
                    .forEach(g -> System.out.print(g.size() + ":" + g));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

}
