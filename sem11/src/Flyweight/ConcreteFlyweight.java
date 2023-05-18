package Flyweight;

public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void operation() {
        System.out.println("ConcreteFlyweight with intrinsic state " + intrinsicState + " is performing operation.");
    }
}
