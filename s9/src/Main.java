import Adapter.JsonParser;
import Adapter.XmlParser;
import Adapter.XmlToJsonParserCls;
import Adapter.XmlToJsonParserObj;
import Facade.ShapeMaker;
import FacadeMasini.DealerAuto;

public class Main {
    public static void main(String[] args) {
        //      ADAPTER - is a (target) + has a (adaptee)
        // Adapter - implements Interface (target)
        // si contine obiect Adaptee (adapt obiecte) / extinde Adaptee (adapt clase)
        // Target, Adaptee, Client (main)
        // Exemplu: xml - json conversie (parser)
        XmlParser xmlParser=new XmlParser();

        //adapter obiecte
        JsonParser jsonParserObj=new XmlToJsonParserObj(xmlParser);
        jsonParserObj.parseJson("{json1}");

        //adapter clase
        JsonParser jsonParserCls=new XmlToJsonParserCls();
        jsonParserCls.parseJson("{json2}");


        //      FACADE - ascunde complexitate frameworkuri
        // clasele complexe
        // facade care contine obiecte de tipurile claselor si opereaza cu metodele lor
        // ! metodele din clasele complexe NU trebuie sa fie aceleasi, nu are legatura cu derivarea :)
        ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        DealerAuto dealerAuto=new DealerAuto();
        dealerAuto.descrieElectrica();
        dealerAuto.descrieFamilie();
        dealerAuto.descrieSport();

        //      COMPOSITE - structuri ierarhice/arborescente (management departamente, menu items)
        // noduri frunza si noduri composite (contin liste de noduri subadiacente)
        // ex: folosim cls abstracta pt a  rentine proprietati angajati
    }
}