package br.ufal.ic.p3.effectivejava;

// Singleton with public final field
//public class Elvis {
//
//    public static final Elvis INSTANCE = new Elvis();
//
//    private Elvis() {   }
//
//    public void leaveTheBuilding() {  }
//
//}

// Singleton with static factory
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {   }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {  }

}
