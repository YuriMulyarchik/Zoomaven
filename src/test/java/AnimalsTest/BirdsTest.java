package AnimalsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BirdsTest extends AnimalsTest {

    @Test(groups = "positive")
    public void moveMethodTest() {
        Assert.assertEquals("летает", "летает");

    }

    @Test(groups = "positive")
    public void breatheMethodTest() {
        Assert.assertNotEquals("дышит легкими", "");
    }


}
