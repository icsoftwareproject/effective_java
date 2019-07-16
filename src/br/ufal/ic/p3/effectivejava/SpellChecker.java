package br.ufal.ic.p3.effectivejava;

import java.util.List;
import java.util.Objects;

//public class SpellChecker {
//    private static final Lexicon dictionary = ...;
//
//    private SpellChecker() {} // Noninstantiable
//
//    public static boolean isValid(String word) { ... }
//
//    public static List<String> suggestions(String typo) { ... }
//
//}

//// Inappropriate use of singleton - inflexible & untestable!
//public class SpellChecker {
//
//    private static final Lexicon dictionary = ...;
//
//    private SpellChecker() {}
//
//    private static INSTANCE = new SpellChecker(...);
//
//    public static boolean isValid(String word) { ... }
//    public static List<String> suggestions(String typo) { ... }
//
//}

// Dependency injection provides flexibility and testability
public class SpellChecker {

    private final Lexicon dictionary;

    private SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public static boolean isValid(String word) { ... }
    public static List<String> suggestions(String typo) { ... }

}

