package animals.birds;

public class Owl extends Bird {
    public Owl(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "спит днем";
    }

}
