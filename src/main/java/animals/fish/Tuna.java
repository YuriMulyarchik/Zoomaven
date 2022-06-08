package animals.fish;

public class Tuna extends Fish{
    public Tuna(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "любят японцы";
    }

}
