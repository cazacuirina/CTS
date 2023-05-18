package SimpleFactoryShape;

public abstract class Shape {
    int noSides;

    public Shape(int noSides) {
        this.noSides = noSides;
    }

    public void getNoSides(){
        System.out.println("Sides: "+this.noSides);
    }
}
