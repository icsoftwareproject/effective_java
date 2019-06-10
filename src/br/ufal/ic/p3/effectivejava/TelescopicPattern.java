package br.ufal.ic.p3.effectivejava;

public class TelescopicPattern {

    private final int man1;
    private final int man2;

    private final int opt1;
    private final int opt2;
    private final int opt3;

    public TelescopicPattern(int man1, int man2) {
        this(man1, man2, 0);
    }

    public TelescopicPattern(int man1, int man2, int opt1) {
        this(man1, man2, opt1, 0);
    }

    public TelescopicPattern(int man1, int man2, int opt1, int opt2) {
        this(man1, man2, opt1, opt2, 0);
    }

    public TelescopicPattern(int man1, int man2, int opt1, int opt2, int opt3) {
        this.man1 = man1;
        this.man2 = man2;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
    }

    public static void main(String[] args) {
        TelescopicPattern pattern = new TelescopicPattern(12, 87, 0, 0, 1);
    }

}
