package Proxy;

import java.util.ArrayList;
import java.util.List;


public class ProxyInternet implements Internet
{
    /* Clasa ProxyInternet acționează ca o barieră de protecție între utilizator și
    RealInternet. ProxyInternet are o obiect de tipul RealInternet, care este utilizat
    pentru a face conexiunea reală la server. Înainte de a se face conexiunea la server,
    se verifică dacă numele server-ului se află pe lista de site-uri interzise. Dacă acesta
    se găsește pe listă, atunci o excepție este aruncată, iar utilizatorul nu poate conecta. */

    private Internet internet = new RealInternet();
    private static List<String> siteuriInterzise;

    static {
        siteuriInterzise = new ArrayList<String>();
        siteuriInterzise.add("www.site1.com");
        siteuriInterzise.add("www.site2.com");
        siteuriInterzise.add("www.site3.com");
        siteuriInterzise.add("www.site4.com");
        siteuriInterzise.add("www.site5.com");
    }
    @Override
    public void connectTo(String serverhost) throws Exception {

        if(siteuriInterzise.contains(serverhost.toLowerCase())) {
            throw new Exception("Acces Interzis");
        }
        internet.connectTo(serverhost);
    }
}
