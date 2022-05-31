package animals.birds;

public class Pigeons extends Birds{
    public Pigeons(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "может приносить почту";
    }
}
