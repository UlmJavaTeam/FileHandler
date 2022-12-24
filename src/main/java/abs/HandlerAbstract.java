package abs;

public abstract class HandlerAbstract {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return this.text;
    }

    public abstract Object parse();

}
