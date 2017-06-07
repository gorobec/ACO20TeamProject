package library;

import org.junit.Assert;
import org.junit.Test;

import static library.Publisher.DEFAULT_PUBLISHER_NAME;


/**
 * Author class
 */
public class CheckPublisher {

    @Test
    public void checkPublisherInit() {
        Publisher p1 = new Publisher(null);
        Publisher p2 = new Publisher("name2");

        Assert.assertEquals(p1.getName(), DEFAULT_PUBLISHER_NAME);
        Assert.assertEquals(p2.getName(), "name2");
    }
}
