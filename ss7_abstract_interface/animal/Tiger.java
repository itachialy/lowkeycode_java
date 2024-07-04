package ss7_abstract_interface.animal;

public class Tiger extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Tiger: Gâu Gâu";
    }

    @Override
    public String howToEat() {
        return "Hổ uống tiger nâu";
    }
}
