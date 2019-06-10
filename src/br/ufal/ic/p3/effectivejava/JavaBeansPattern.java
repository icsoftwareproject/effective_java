package br.ufal.ic.p3.effectivejava;

public class JavaBeansPattern {

    private int man1;
    private int man2;

    private int opt1;
    private int opt2;
    private int opt3;

    public JavaBeansPattern() { }

    public void setMan1(int man1) { this.man1 = man1; }

    public void setMan2(int man2) { this.man2 = man2; }

    public void setOpt1(int opt1) { this.opt1 = opt1; }

    public void setOpt2(int opt2) { this.opt2 = opt2; }

    public void setOpt3(int opt3) { this.opt3 = opt3; }

    public static void main(String[] args) {
        JavaBeansPattern pattern = new JavaBeansPattern();
        pattern.setMan1(12);
        pattern.setMan2(87);
        pattern.setOpt3(1);
    }

}
