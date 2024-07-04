package ss7_abstract_interface.animal;

public class Chicken extends  Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken : Mèo méo meo mèo meo";
    }

    @Override
    public String howToEat() {
        return "gà ăn KFC";
    }
}
