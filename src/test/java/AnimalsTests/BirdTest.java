package AnimalsTests;

import animals.birds.Bird;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BirdTest {

    @Test(groups = {"positive"})
    public void moveMethodTest() {
        Bird testBird = new Bird("testName", "testTypeOfFood") {
            @Override
            public String feature() {
                return null;
            }

        };
        Assert.assertEquals(testBird.moveMethod(), "летает", "moveMethod for Bird class - " +
                testBird.moveMethod() + " is incorrect");
    }

    @Test(groups = {"positive"})
    public void breatheMethodTest() {
        Bird testBird = new Bird("testName", "testTypeOfFood") {
            @Override
            public String feature() {
                return null;
            }

        };

        Assert.assertEquals(testBird.breatheMethod(), "дышит легкими", "moveMethod for Bird class - " +
                testBird.breatheMethod() + " is incorrect");
    }


}
