package br.ufal.ic.p3.effectivejava;

public class BuilderPattern {

    private final int man1;
    private final int man2;

    private int opt1;
    private int opt2;
    private int opt3;

    public static class Builder {

        private final int man1, man2;
        private int opt1, opt2, opt3;

        public Builder(int man1, int man2) {
            this.man1 = man1; this.man2 = man2;
        }

        public Builder opt1(int val) { this.opt1 = val; return this; }

        public Builder opt2(int val) { this.opt2 = val; return this; }

        public Builder opt3(int val) { this.opt3 = val; return this; }

        public BuilderPattern build() { return new BuilderPattern(this); }

    }

    public BuilderPattern(Builder builder) {
        this.man1 = builder.man1;
        this.man2 = builder.man2;
        this.opt1 = builder.opt1;
        this.opt2 = builder.opt2;
        this.opt3 = builder.opt3;
    }

    public static void main(String[] args) {

        String s1 = new String("My little string.");

        String s2 = "My little string.";

        BuilderPattern pattern = new Builder(12, 87).opt1(1).opt3(9).build();
    }

}
