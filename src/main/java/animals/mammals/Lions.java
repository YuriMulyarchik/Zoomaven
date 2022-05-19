package animals.mammals;

public class Lions extends Mammals{

    public Lions(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "царь зверей";
    }
}
