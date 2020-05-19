import gui.Gui;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    Gui g;

    @Override
    public void start(Stage stage) throws Exception {
        g = new Gui(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
