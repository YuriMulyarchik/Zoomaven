package animals.mammals;

public class Elephant extends Mammal {

    public Elephant(String animalName, String typeOfFood) {
        super(animalName, typeOfFood);
    }

    @Override
        public String feature() {
            return "ест и пьет с помощью хобота";
        }
    @Override
    public String moveMethod() {
        return "передвигается по земле";
    }

    @Override
    public String breatheMethod() {
        return "дышит легкими";
    }
    }

