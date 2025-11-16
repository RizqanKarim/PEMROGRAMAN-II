package lat3;

public class Dog extends AbstractAnimal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.name + " berkata: Guk! Guk!";
    }
}