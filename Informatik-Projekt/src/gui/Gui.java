package gui;


import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Gui {

    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;
    public static Button[] btns = new Button[3];

    public Gui(Stage stage) {

        btns[0] = new Button(SCREEN_WIDTH/2-100, SCREEN_HEIGHT/2 - 125, 200, 50, "Play");
        btns[1] = new Button(SCREEN_WIDTH/2-100, SCREEN_HEIGHT/2 - 25, 200, 50, "Stats");
        btns[2] = new Button(SCREEN_WIDTH/2-100, SCREEN_HEIGHT/2 + 75, 200, 50, "Quit");

        Canvas canvas = new Canvas(SCREEN_WIDTH, SCREEN_HEIGHT);
        StackPane root = new StackPane();
        Draw draw_main = new Draw(canvas.getGraphicsContext2D());

        root.getChildren().add(canvas);
        Scene scene = new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT);

        stage.setResizable(false);
        stage.setTitle("TEST");
        stage.setScene(scene);
        stage.show();
    }
}
