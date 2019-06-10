package br.ufal.ic.p3.effectivejava;

import java.util.Calendar;
import java.util.Date;

public class Person {

//    private final Date dateOfBirth = new Date(86458474L);
//
//    // ...
//
//    public boolean isBabyBoomer() {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
//        Date boomStart = calendar.getTime();
//        calendar.set(1965, Calendar.JANUARY, 1,0,0,0);
//        Date boomEnd = calendar.getTime();
//
//        return dateOfBirth.compareTo(boomStart) >= 0 && dateOfBirth.compareTo(boomEnd) < 0;
//    }

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1946, Calendar.JANUARY, 1,0,0,0);
        BOOM_START = calendar.getTime();
        calendar.set(1965, Calendar.JANUARY, 1,0,0,0);
        BOOM_END = calendar.getTime();
    }

    private final Date dateOfBirth = new Date(86458474L);

    public boolean isBabyBoomer() {
        return dateOfBirth.compareTo(BOOM_START) >= 0 && dateOfBirth.compareTo(BOOM_END) < 0;
    }

    public static void main(String... args) {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}
