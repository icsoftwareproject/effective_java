package br.ufal.ic.p3.effectivejava;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "Set";
    }

    public static String classify(List<?> lst) {
        return "List";
    }

    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }

//    public static void main(String[] args) {
//        Collection<?>[] collections = {
//                new HashSet<String>(),
//                new ArrayList<BigInteger>(),
//                new HashMap<String, String>().values()
//        };
//
//        for (Collection<?> c : collections) {
//            System.out.println(classify(c));
//        }
//    }

//    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<Integer>();
//        List<Integer> list = new ArrayList<Integer>();
//
//        for (int i = -3; i < 3; i++) {
//            set.add(i); list.add(i);
//        }
//
//        for (int i = 0; i < 3; i++) {
//            set.remove(i); list.remove(i);
//        }
//
//        System.out.println(set + " " + list);
//    }

//    public static void main(String[] args) {
//        double funds = 1.0;
//        int itemsBought = 0;
//        for (double price = .10; funds >= price; price += .10) {
//            funds -= price;
//            itemsBought++;
//        }
//        System.out.println(itemsBought + " items bought.");
//        System.out.println("Change : $" + funds);
//    }

    public static void main(String[] args) {
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");

        for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
            itemsBought++;
            funds = funds.subtract(price);
        }

        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: $" + funds);
    }
}
