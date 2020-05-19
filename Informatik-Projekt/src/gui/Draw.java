package gui;

import javafx.geometry.VPos;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class Draw {
    public Draw(GraphicsContext g) {
        g.setFill(Color.BLACK);
        g.fillRect(0,0, Gui.SCREEN_WIDTH,Gui.SCREEN_HEIGHT);


        // should be replaced with a Button
        g.setFill(Color.WHITE);
        g.setFont(Font.font("Veranda", 45));
        g.setTextAlign(TextAlignment.CENTER);
        g.setTextBaseline(VPos.CENTER);
        g.fillText("Play", Gui.SCREEN_WIDTH/2, Gui.SCREEN_HEIGHT/2);


    }
}
