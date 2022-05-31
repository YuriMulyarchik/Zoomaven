package AnimalsTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BirdTest extends AnimalTest {

    @Test(groups = "positive")
    public void moveMethodTest() {
        Assert.assertEquals("летает", "летает");

    }

    @Test(groups = "positive")
    public void breatheMethodTest() {
        Assert.assertNotEquals("дышит легкими", "");
    }


}
