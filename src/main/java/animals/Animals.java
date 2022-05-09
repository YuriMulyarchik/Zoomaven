package animals;

public class Animals {

    private String animalName;
    private String typeOfFood;

    public Animals(String animalName, String typeOfFood) {
        this.animalName = animalName;
        this.typeOfFood = typeOfFood;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }




    public String toString() {
        return animalName + ", тип питания: " + typeOfFood + breatheMethod() + moveMethod();
    }

    public String moveMethod() {

        return null;
    }

    public String breatheMethod() {
        return null;
    }




}
