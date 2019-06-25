package ar.edu.unahur.obj2.ejercicio3;

public class LinkTag implements TipoNode {

    private String label;

    public LinkTag(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public void ejecute(){
        this.getLabel();
    }
}
