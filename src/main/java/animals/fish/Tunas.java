package animals.fish;

public class Tunas extends Fish{
    public Tunas(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "любят японцы";
    }
}
