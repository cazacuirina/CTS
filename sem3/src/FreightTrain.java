public class FreightTrain implements CapacityInterface{
    private int width, height;

    public FreightTrain(int width, int height) {
        this.width=width;
        this.height=height;
    }

    @Override
    public void getCapacity() {
        System.out.println("Freight train capacity: "+width*height+" tons");
    }
}
