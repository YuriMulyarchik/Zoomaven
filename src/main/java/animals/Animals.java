package animals;

public abstract class Animals {

    private String animalName;
    private String typeOfFood;


    public Animals(String animalName, String typeOfFood) {
        if (animalName == null) {
            this.animalName = "animalName can't be null, set correct animalName";
        } else if (animalName == "") {
            this.animalName = "animalName can't be empty, set correct animalName";
        } else
            this.animalName = animalName;
        if (typeOfFood == null) {
            this.typeOfFood = "typeOfFood can't be null, set correct typeOfFood";
        } else if (typeOfFood == "") {
            this.typeOfFood = "incorrect typeOfFood, set correct animal typeOfFood";
        } else if (typeOfFood.equals("хищник") || typeOfFood.equals("травоядный") || typeOfFood.equals("всеядный") ||
                typeOfFood.equals("травоядная") || typeOfFood.equals("всеядная")) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "incorrect typeOfFood, set correct animal typeOfFood";
        }

    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        if (animalName == null) {
            this.animalName ="animalName can't be null, set correct animalName";
        } else if (animalName == "") {
            this.animalName = "animalName can't be empty, set correct animalName";
        } else
        this.animalName = animalName;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood.equals("хищник") || typeOfFood.equals("травоядный") || typeOfFood.equals("всеядный") ||
                typeOfFood.equals("травоядная") || typeOfFood.equals("всеядная")) {
            this.typeOfFood = typeOfFood;
        } else  {
            this.typeOfFood = "incorrect typeOfFood, set correct animal typeOfFood";
        }//тут не учитываю вариант с null, чтобы сделать exception тест

    }

    public String toString() {
        return animalName + ", тип питания: " + typeOfFood + ", тип дыхания: " + breatheMethod() +
                ", способ передвижения: " + moveMethod() + ", особенность: " + feature();
    }

    public abstract String moveMethod();

    public abstract String breatheMethod();

    public abstract String feature();





}
