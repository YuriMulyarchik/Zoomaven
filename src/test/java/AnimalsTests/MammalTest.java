package AnimalsTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MammalTest extends AnimalTest {



    @Test(groups = "positive")
    public void moveMethodTest() {
        Assert.assertEquals("передвигается по земле", "передвигается по земле");
    }

    @Test(groups = "positive")
    public void breatheMethodTest() {
        Assert.assertNotEquals("дышит легкими", "");
    }


}
