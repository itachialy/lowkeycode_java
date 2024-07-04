package ss7_abstract_interface.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
        }
        Edible edible = new Chicken();
        Edible edible1 = new Tiger();
        System.out.println(edible.howToEat());
        System.out.println(edible1.howToEat());
    }
}
