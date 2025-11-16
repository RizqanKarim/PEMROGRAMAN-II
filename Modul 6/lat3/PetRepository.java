package lat3;

import java.util.Map;
import java.util.HashMap;

public class PetRepository {
    private Map<String, Pet> pets = new HashMap<>();

    public PetRepository() {
        pets.put("daoa", new Dog("Daoa si Anjing"));
        pets.put("alip", new Cat("Alip si Kucing"));
    }

    public Pet findPet(String name) {
        return pets.get(name);
    }

    public Map<String, Pet> getAllPets() {
        return pets;
    }
}
