package ar.edu.unahur.obj2.ejercicio3;

public class TextExtractor {

    private Parser parser;
    public String extractText(Parser parser) {
        StringBuffer text = new StringBuffer();
        for (TipoNode tiponode : parser.tiposnodes()) {
                extractTipoNode(node, text);
        }
        return text.toString();
    }
    private void extractTipoNode(TipoNode tipoNode,StringBuffer text){text.append(tipoNode.ejecute());}

    //private void extractStringNode(Node node, StringBuffer text) {
    //    text.append(((StringNode)node).getText());
    //}

    //private void extractTag(Node node, StringBuffer text) {
    //    text.append(((Tag)node).getValue());
    //}

    //private void extractLinkTag(Node node, StringBuffer text) {
    //    text.append(((LinkTag)node).getLabel());
    //}

}
