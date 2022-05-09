package animals;



public class Mammals extends Animals {

    public Mammals(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }

    @Override
    public String moveMethod() {
        return ", передвигается по земле";
    }

    @Override
    public String breatheMethod() {
        return ", дышит легкими";
    }

}
