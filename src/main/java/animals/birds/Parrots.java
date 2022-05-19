package animals.birds;

public class Parrots extends Birds{
    public Parrots(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "повторяет речь";
    }
}
