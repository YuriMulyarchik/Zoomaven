package animals.birds;

public class Owls extends Birds{
    public Owls(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }
    @Override
    public String feature() {
        return "спит днем";
    }


}
