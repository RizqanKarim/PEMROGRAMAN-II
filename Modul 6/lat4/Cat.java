package lat4;

public class Cat extends AbstractAnimal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.name + " berkata: Meong...";
    }
}