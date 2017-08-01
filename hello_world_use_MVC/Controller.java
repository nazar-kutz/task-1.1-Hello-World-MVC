package N1_hello_world_use_MVC;

import java.util.Scanner;

import static N1_hello_world_use_MVC.View.*;

/**
 * Created by HP on 18.07.2017.
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.addTextString(inputStringWithScanner(sc, "hello"));
        model.addTextString(inputStringWithScanner(sc, "world"));

        view.printMessage(OUR_OUTPUT_STRING + model.getText());
    }

    /**
     * this method read and check an inputed string with pattern string
     * process of reading will continue until pattern and input will equals
     * @param sc
     * @param pattern
     * @return inputed string
     */
    public String inputStringWithScanner(Scanner sc, String pattern){
        view.printMessage(INPUT_STR_VALUE);
        String intermediateValue = sc.nextLine();   //intermediate String value red by Scanner
        while(!intermediateValue.equalsIgnoreCase(pattern)){
            view.printMessage(WRONG_INPUT + INPUT_WORD + "\"" + pattern + "\"! " + REPEAT_PLEASE + INPUT_STR_VALUE);
            intermediateValue = sc.nextLine();
        }
        return intermediateValue;
    }
}

