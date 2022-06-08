package animals.birds;

public class Parrot extends Bird {
    public Parrot(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "повторяет речь";
    }

}
