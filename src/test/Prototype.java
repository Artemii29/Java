package test;


interface Copyable {
    Copyable copy();
}

public class Prototype implements Copyable {
    private Type type;

    public enum Type {
        ONE, TWO
    }

    public Prototype copy() {
        Prototype prototype = new Prototype();
        prototype.setType(this.type);
        return prototype;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
