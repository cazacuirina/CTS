public class Train implements CapacityInterface {
    private int passengers;

    public Train(int passengers){
        this.passengers=passengers;
    }

    @Override
    public void getCapacity() {
        System.out.println("Train capacity: "+passengers+" passengers");
    }
}
