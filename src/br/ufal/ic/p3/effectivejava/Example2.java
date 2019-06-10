package br.ufal.ic.p3.effectivejava;

import java.util.Objects;

public class Example2 {

    private Object strategy;

    public Example2(Object strategy) {
        this.strategy = Objects.requireNonNull(strategy, "strategy");
    }

}
