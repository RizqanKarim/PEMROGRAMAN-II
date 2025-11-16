package lat3;

public abstract class AbstractAnimal implements Pet {
    protected String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String speak();
}