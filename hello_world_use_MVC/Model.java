package N1_hello_world_use_MVC;

/**
 * Created by HP on 18.07.2017.
 */
public class Model {
    //text information of the model
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    //constructor
    public Model() {
        //initialize text as an empty string
        this.text = "";
    }

    // The Program logic
    /**
     * in this method add text with this.text
     * @param text
     * @return coalescence
     */
    public void addTextString(String text){
        this.text += " ";
        this.text += text;
    }
}
