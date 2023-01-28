package player;

import mark.MarkIdentifier;

public class Player {
    private int queuePriority;
    private String name;
    private MarkIdentifier markIdentifier;

    public Player(String name, MarkIdentifier markIdentifier,int queuePriority) {
        this.name = name;
        this.markIdentifier = markIdentifier;
        this.queuePriority=queuePriority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarkIdentifier(MarkIdentifier markIdentifier) {
        this.markIdentifier = markIdentifier;
    }

    public String getName() {
        return name;
    }

    public MarkIdentifier getMarkIdentifier() {
        return markIdentifier;
    }

    public int getQueuePriority() {
        return queuePriority;
    }
}
