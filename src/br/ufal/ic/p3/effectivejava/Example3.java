package br.ufal.ic.p3.effectivejava;

import java.util.*;

public class Example3 {

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    public static synchronized Calendar getInstance() {
        return new GregorianCalendar();
    }

    public static <E> Collection<E> unmodifiableCollection (Collection<? extends E> collection) {
        if (collection == null) {
            throw new NullPointerException();
        }
        return new UnmodifiableCollection<E>((Collection<E>) collection);
    }

    public static void main(String[] args) {
        Map<String, List<String>> m2 = new HashMap<String, List<String>>();

        Map<String, List<String>> m = HashMap.newInstance();
    }

    public static <K, V> HashMap<K, V> newInstance() {
        return new HashMap<K, V>();
    }

}
