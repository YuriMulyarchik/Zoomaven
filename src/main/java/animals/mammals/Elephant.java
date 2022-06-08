package animals.mammals;

public class Elephant extends Mammal {

    public Elephant(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }

    @Override
        public String feature() {
            return "ест и пьет с помощью хобота";
        }

    }

