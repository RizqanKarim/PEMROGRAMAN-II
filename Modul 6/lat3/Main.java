package lat3;

public class Main {
    public static void main(String[] args) {
        PetRepository repository = new PetRepository();
        PetView view = new PetView();
        PetShopApp app = new PetShopApp(repository, view);
        app.run();
    }
}
