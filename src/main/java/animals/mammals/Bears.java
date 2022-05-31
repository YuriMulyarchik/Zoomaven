package animals.mammals;

public class Bears extends Mammals{

    public Bears(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }

    @Override
    public String feature() {
            return "спит зимой";
    }

}
