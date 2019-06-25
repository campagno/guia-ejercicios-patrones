package ar.edu.unahur.obj2.ejercicio3;

public class Tag  implements Node {

    private String value;

    public Tag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void ejecute() {
        this.getValue();
    }
}
