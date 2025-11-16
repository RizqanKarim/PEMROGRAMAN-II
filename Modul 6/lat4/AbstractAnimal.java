package lat4;
public abstract class AbstractAnimal implements Pet {
    protected String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String speak();

    public static Pet createPet(String type, String name) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog(name + " si Anjing");
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat(name + " si Kucing");
        }
        return null;
    }
}
