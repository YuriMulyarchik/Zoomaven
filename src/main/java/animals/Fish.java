package animals;

public class Fish extends Animals {

    public Fish (String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }

    @Override
    public String moveMethod() {
       return ", плавает";

    }
    @Override
    public String breatheMethod() {
        return ", дышит жабрами";
    }









}



