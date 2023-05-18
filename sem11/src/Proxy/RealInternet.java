package Proxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverhost) {
        System.out.println("Se conecteaza la: " + serverhost);
    }
}

  /*  clasa RealInternet implementează Internet și este responsabilă pentru
            conectarea utilizatorului la server-ul specificat  */