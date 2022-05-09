package animals;

public class Birds extends Animals {
    public Birds(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }

    @Override
    public String moveMethod() {

        return ", летает";
    }

    @Override
    public String breatheMethod() {
        return ", дышит легкими";
    }

}
