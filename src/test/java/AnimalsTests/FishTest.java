package AnimalsTests;


import animals.fish.Fish;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FishTest {
    @Test(groups = {"positive"})
    public void moveMethodTest() {
        Fish testFish = new Fish("testName", "testTypeOfFood") {
            @Override
            public String feature() {
                return null;
            }
        };
        Assert.assertEquals(testFish.moveMethod(), "плавает", "moveMethod for Fish class - " +
                testFish.moveMethod() + " is incorrect");
    }

    @Test(groups = {"positive"})
    public void breatheMethodTest() {
        Fish testFish = new Fish("testName", "testTypeOfFood") {
            @Override
            public String feature() {
                return null;
            }
        };

        Assert.assertEquals(testFish.breatheMethod(), "дышит жабрами", "moveMethod for Fish class - " +
                testFish.breatheMethod() + " is incorrect");
    }

}
