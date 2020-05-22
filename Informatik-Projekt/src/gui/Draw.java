package gui;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Draw {

    private Text text = new Text();

    public Draw(GraphicsContext g) {
        g.setFill(Color.BLACK);
        g.fillRect(0,0, Gui.SCREEN_WIDTH,Gui.SCREEN_HEIGHT);

        // should be replaced with a Button
        g.setFill(Color.WHITE);
        g.setStroke(Color.GRAY);

        for(Button b : Gui.btns) {
            g.strokeRect(b.x, b.y, b.width, b.height);

            text.setFont(Font.font("Veranda", 30));
            text.setText(b.text);
            g.setFont(Font.font("Veranda", 35));
            g.fillText(b.text, b.x + (double) b.width / 2 - text.getLayoutBounds().getWidth()/2,
                    b.y + (double) b.height / 2 + text.getLayoutBounds().getHeight() / 4);
        }
    }
}
