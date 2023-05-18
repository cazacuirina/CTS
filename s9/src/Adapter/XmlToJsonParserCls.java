package Adapter;

public class XmlToJsonParserCls extends XmlParser implements JsonParser{
    @Override
        public void parseJson(String json) {
            String xml=convertJsonToXml(json);
            super.parseXml(xml);
        }
        private String convertJsonToXml(String json){
            return json;
        }

}
