package animals.mammals;

import animals.Animal;

public abstract class Mammal extends Animal {


    public Mammal(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String moveMethod() {
        return "передвигается по земле";
    }

    @Override
    public String breatheMethod() {
        return "дышит легкими";
    }



}
