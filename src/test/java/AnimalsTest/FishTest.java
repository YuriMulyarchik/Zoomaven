package AnimalsTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FishTest extends AnimalsTest {
    @Test(groups = "positive")
    public void moveMethodTest() {
        Assert.assertEquals("плавает", "плавает");

    }

    @Test(groups = "positive")
    public void breatheMethodTest() {
        Assert.assertNotEquals("дышит жабрами", "");
    }
}
