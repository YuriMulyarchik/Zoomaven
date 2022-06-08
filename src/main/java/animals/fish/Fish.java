package animals.fish;

import animals.Animal;

public abstract class Fish extends Animal {

    public Fish (String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }

    @Override
    public String moveMethod() {
        return "плавает";
    }
    @Override
    public String breatheMethod() {
        return "дышит жабрами";
    }


}



