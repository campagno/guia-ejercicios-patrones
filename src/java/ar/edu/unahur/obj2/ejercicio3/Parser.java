package ar.edu.unahur.obj2.ejercicio3;

import java.util.List;

public class Parser {

    private LinkTag linkTag = new LinkTag();
    private Tag tag = new Tag();
    private StringNode stringNode = new StringNode();
    private TipoNode tipoNode = new TipoNode();

    public Parser(TipoNode tipoNode) {
        this.tipoNode = tipoNode;
    }

    public TipoNode getTipoNode() {
        return tipoNode;
    }

    private List<TipoNode> tiposnodes;

    public Parser(List<TipoNode> tiposnodes) {
        this.tiposnodes = tiposnodes;
    }

    public List<TipoNode> tiposnodes() {
        return tiposnodes;
    }
    public void ejecuteTiponode(){
        this.getTipoNode().ejecute();
    }
}
