package gui;

public class Button {
    public int x, y, width, height;
    public String text;
    public Boolean isHover;

    public Button(int x, int y, int width, int height, String text) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
    }
}
