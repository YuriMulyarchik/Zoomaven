package AnimalsTests;

import animals.mammals.Mammal;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MammalTest {


    @Test(groups = {"positive"})
    public void moveMethodTest() {
        Mammal testMammal = new Mammal("testName", "testTypeOfFood") {
            @Override
            public String feature() {
                return null;
            }

        };
        Assert.assertEquals(testMammal.moveMethod(), "передвигается по земле", "moveMethod for"
                + " Mammal class - " + testMammal.moveMethod() + " is incorrect");
    }

    @Test(groups = {"positive"})
    public void breatheMethodTest() {
        Mammal testMammal = new Mammal("testName", "testTypeOfFood") {
            @Override
            public String feature() {
                return null;
            }

        };
        Assert.assertEquals(testMammal.breatheMethod(), "дышит легкими", "moveMethod" +
    "for Mammal class - " + testMammal.breatheMethod() + " is incorrect");
    }



}
