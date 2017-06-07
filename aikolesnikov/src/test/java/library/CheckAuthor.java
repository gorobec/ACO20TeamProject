package library;

import org.junit.Assert;
import org.junit.Test;

import static library.Author.DEFAULT_AUTHOR_NAME;

/**
 * Author class
 */
public class CheckAuthor {

    @Test
    public void checkAuthorInit(){
        Author a1 = new Author(null);
        Author a2 = new Author("name2");

        Assert.assertEquals(a1.getName(),DEFAULT_AUTHOR_NAME);
        Assert.assertEquals(a2.getName(),"name2");
    }
}
