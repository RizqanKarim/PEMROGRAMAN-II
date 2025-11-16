package lat4;

public class PetShopFacade {

    public void start() {
        PetRepository repository = new PetRepository();
        PetView view = new PetView();
        PetShopApp app = new PetShopApp(repository, view);
        app.run();
    }
}
