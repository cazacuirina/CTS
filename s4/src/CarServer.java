public class CarServer {
    int locationCode;
    int noCars;
    String serverName;

    private CarServer() {
        this.locationCode = 1000;
        this.serverName = "Car Server";
        this.noCars=0;
    }

    public int getNoCars() {
        return noCars;
    }

    public void setNoCars(int noCars) {
        this.noCars = noCars;
    }

    private static CarServer instance;

    //synchronised? - thread safe
    public static synchronized CarServer getInstance(){
        if(instance==null){
            System.out.println("NEW");
            instance=new CarServer();
        }
        return instance;
    }

    public String showStatus(){
        return serverName+" server from location: "+locationCode+" has currently "+noCars+" cars";
    }
}
