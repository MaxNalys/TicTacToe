package player;

import mark.MarkIdentifier;

public class Player {
    private String name;
    private MarkIdentifier markIdentifier;

    public Player(String name, MarkIdentifier markIdentifier) {
        this.name = name;
        this.markIdentifier = markIdentifier;
    }



    public String getName() {
        return name;
    }

    public MarkIdentifier getMarkIdentifier() {
        return markIdentifier;
    }


}
