package lat4;

import java.util.Map;
import java.util.HashMap;

public class PetRepository {
    private Map<String, Pet> pets = new HashMap<>();

    public PetRepository() {
        pets.put("daoa", AbstractAnimal.createPet("dog", "Daoa"));
        pets.put("alip", AbstractAnimal.createPet("cat", "Alip"));
    }

    public Pet findPet(String name) {
        return pets.get(name);
    }

    public Map<String, Pet> getAllPets() {
        return pets;
    }
}
