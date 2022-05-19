package animals.mammals;

public class Elephants extends Mammals{

    public Elephants(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }

    @Override
        public String feature() {
            return "ест и пьет с помощью хобота";
        }
    }

