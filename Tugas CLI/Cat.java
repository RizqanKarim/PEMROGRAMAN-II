package lat2;

public class Cat extends AbstractAnimal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("-> " + this.name + " berkata: Meong...");
    }
}
