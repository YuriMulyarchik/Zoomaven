package animals.birds;

public class Pigeon extends Birds{
    public Pigeon(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "может приносить почту";
    }
}
