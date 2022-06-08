package animals.fish;

public class Shark extends Fish{

    public Shark(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "не спит";
    }

}
