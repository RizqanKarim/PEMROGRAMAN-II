package lat2;

public class Dog extends AbstractAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("-> " + this.name + " berkata: Guk! Guk!");
    }
}
