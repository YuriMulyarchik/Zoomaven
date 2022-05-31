package animals.mammals;

public class Lion extends Mammal {

    public Lion(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "царь зверей";
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
