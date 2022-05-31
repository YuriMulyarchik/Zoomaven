package AnimalsTest;

import animals.Animals;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnimalsTest {

    @Test(groups = {"positive"}, enabled = false)
    public void typeOfFoodTest() {
        System.out.println("тест типа питания");
    }

    @Test(groups = {"positive"}, enabled = false)
    public void animalNameTest() {
        System.out.println("тест имени");
    }

    @Test(groups = {"positive"}, enabled = false)
    public void moveMethodTest() {
        System.out.println("тест движения");
    }

    @Test(groups = {"positive"}, enabled = false)
    public void breatheMethodTest() {
        System.out.println("тест дыхания");
    }

    @Test(groups = {"positive"}, enabled = false)
    public void featureTest() {
        System.out.println("тест особенности");
    }

    @Test(groups = {"negative"})
    public void animalConstructorWithNullParametersTest() {
        Animals testName = new Animals(null,null) {

            @Override
            public String moveMethod() {
                return null;
            }

            @Override
            public String breatheMethod() {
                return null;
            }

            @Override
            public String feature() {
                return null;
            }
        };
        Assert.assertEquals(testName.getAnimalName(),"animalName can't be null, set correct animalName");
        Assert.assertEquals(testName.getTypeOfFood(),"typeOfFood can't be null, set correct typeOfFood");
    }

    @Test(groups = {"negative"})
    public void animalConstructorWithEmptyParametersTest() {
        Animals testName = new Animals("","") {

            @Override
            public String moveMethod() {
                return null;
            }

            @Override
            public String breatheMethod() {
                return null;
            }

            @Override
            public String feature() {
                return null;
            }
        };
        Assert.assertEquals(testName.getAnimalName(),"animalName can't be empty, set correct animalName");
        Assert.assertEquals(testName.getTypeOfFood(),"incorrect typeOfFood, set correct animal typeOfFood");
    }

    @Test(groups = {"negative"})
    public void setNullToAnimalNameTest() {
        Animals testName = new Animals("testName", "") {
            @Override
            public String moveMethod() {
                return null;
            }

            @Override
            public String breatheMethod() {
                return null;
            }

            @Override
            public String feature() {
                return null;
            }


        };
        testName.setAnimalName(null);
        Assert.assertEquals(testName.getAnimalName(),"animalName can't be null, set correct animalName");
    }

    @Test(groups = {"negative"})
    public void setEmptyAnimalNameTest() {
        Animals testName = new Animals("testAnimalName", "") {
            @Override
            public String moveMethod() {
                return null;
            }

            @Override
            public String breatheMethod() {
                return null;
            }

            @Override
            public String feature() {
                return null;
            }

        };
        testName.setAnimalName("");
        Assert.assertEquals(testName.getAnimalName(),"animalName can't be empty, set correct animalName");
    }

    @Test(groups = {"negative"})
    public void setIncorrectTypeOfFoodTest() {
        Animals testName = new Animals("testAnimalName", "testTypeOfFood") {
            @Override
            public String moveMethod() {
                return null;
            }

            @Override
            public String breatheMethod() {
                return null;
            }

            @Override
            public String feature() {
                return null;
            }

        };
        testName.setTypeOfFood("");
        Assert.assertEquals(testName.getTypeOfFood(),"incorrect typeOfFood, set correct animal typeOfFood");
    }

    @Test(expectedExceptions = NullPointerException.class, groups = {"negative"})
    public void setNullTypeOfFoodTest() {
        Animals testName = new Animals("testAnimalName", "testTypeOfFood") {
            @Override
            public String moveMethod() {
                return null;
            }

            @Override
            public String breatheMethod() {
                return null;
            }

            @Override
            public String feature() {
                return null;
            }
        };
        testName.setTypeOfFood(null);
    }

}
