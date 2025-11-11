package lat2;

// abstrak class
public abstract class AbstractAnimal implements Pet {

      protected String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

     @Override
    public abstract void speak();
}