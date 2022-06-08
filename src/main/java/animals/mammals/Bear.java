package animals.mammals;

public class Bear extends Mammal {

    public Bear(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }

    @Override
    public String feature() {
            return "спит зимой";
    }


}
