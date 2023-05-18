// SINGLETON
public class ChatServer {
    int portNo;
    String name;
    static ChatServer instance;

    private ChatServer(int portNo, String name) {
        this.portNo = portNo;
        this.name = name;
    }
    public static ChatServer getInstance(int portNo, String name){
        if(instance==null){
            instance=new ChatServer(portNo, name);    //ChatServer.instance
        }
        return instance;
    }

    public String showStatus(){
        return name+" server started on port: "+portNo;
    }

    @Override
    public String toString() {
        return "ChatServer{" +
                "portNo=" + portNo +
                ", name='" + name + '\'' +
                '}';
    }
}
