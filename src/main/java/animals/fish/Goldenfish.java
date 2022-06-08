package animals.fish;

public class Goldenfish extends Fish{
    public Goldenfish(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "выполняет желания";
    }

}
