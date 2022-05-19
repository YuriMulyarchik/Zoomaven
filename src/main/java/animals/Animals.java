package animals;

public abstract class Animals {

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
        return animalName + ", тип питания: " + typeOfFood + ", тип дыхания: " + breatheMethod() +
                ", способ передвижения: " + moveMethod() + ", особенность: " + feature();
    }

    public abstract String moveMethod();

    public abstract String breatheMethod();

    public abstract String feature();





}
