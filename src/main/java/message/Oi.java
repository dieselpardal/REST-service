package message;

public class Oi {

    private final long id;
    private final String content;

    public Oi(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
