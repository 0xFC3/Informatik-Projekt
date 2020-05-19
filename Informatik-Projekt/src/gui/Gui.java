package gui;


import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Gui {

    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;

    public Gui(Stage stage) {
        Canvas canvas = new Canvas(SCREEN_WIDTH, SCREEN_HEIGHT);
        StackPane root = new StackPane();
        Draw draw_main = new Draw(canvas.getGraphicsContext2D());

        root.getChildren().add(canvas);
        Scene scene = new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT);

        stage.setTitle("TEST");
        stage.setScene(scene);
        stage.show();
    }
}
