package animals.birds;

public class Pigeon extends Bird {
    public Pigeon(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "может приносить почту";
    }
    @Override
    public String moveMethod() {
        return "летает";
    }

    @Override
    public String breatheMethod() {
        return "дышит легкими";
    }

}
