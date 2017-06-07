package library;

/**
 * Publisher
 */
public class Publisher {
    static final String DEFAULT_PUBLISHER_NAME = "_author_";

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Publisher(String name) {
        if (name == null) {
            this.name = DEFAULT_PUBLISHER_NAME;
        } else
            this.name = name;
    }
}
