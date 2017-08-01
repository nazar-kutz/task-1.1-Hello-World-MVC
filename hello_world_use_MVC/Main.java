package N1_hello_world_use_MVC;

/**
 * Created by HP on 18.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        //Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        //Run
        controller.processUser();
    }
}
