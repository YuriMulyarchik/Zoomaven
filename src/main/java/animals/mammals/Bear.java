package animals.mammals;

public class Bear extends Mammal {

    public Bear(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }

    @Override
    public String feature() {
            return "спит зимой";
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
