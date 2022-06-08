package animals.birds;

import animals.Animal;

public abstract class Bird extends Animal {
    public Bird(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }

    @Override
    public String moveMethod() {
        return "летает";
    }

    @Override
    public String breatheMethod() {
        return "дышит легкими";
    }
}
