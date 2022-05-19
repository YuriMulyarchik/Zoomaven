package animals.fish;

public class Sharks extends Fish{

    public Sharks(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "не спит";
    }
}
