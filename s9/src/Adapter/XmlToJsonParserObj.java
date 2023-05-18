package Adapter;

public class XmlToJsonParserObj implements JsonParser{
    XmlParser xmlParser;

    public XmlToJsonParserObj(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    @Override
    public void parseJson(String json) {
        String xml=convertJsonToXml(json);
        xmlParser.parseXml(xml);
    }
    private String convertJsonToXml(String json){
        return json;
    }
}
