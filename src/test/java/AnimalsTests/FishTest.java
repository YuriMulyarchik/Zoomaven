package AnimalsTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FishTest extends AnimalTest {
    @Test(groups = "positive")
    public void moveMethodTest() {
        Assert.assertEquals("плавает", "плавает");

    }

    @Test(groups = "positive")
    public void breatheMethodTest() {
        Assert.assertNotEquals("дышит жабрами", "");
    }
}
