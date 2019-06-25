package ar.edu.unahur.obj2.ejercicio3;

public class StringNode implements TipoNode {

    private String text;

    public StringNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void ejecute() {
        this.getText();
    }
}
