package library;

/**
 * Author
 */
public class Author {
    static final String DEFAULT_AUTHOR_NAME = "_author_";
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Author(String name) {
        if (name == null) {
            this.name = DEFAULT_AUTHOR_NAME;
        } else
            this.name = name;
    }
}
