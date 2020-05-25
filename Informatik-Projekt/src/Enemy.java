public class Enemy extends Character{

    private int speed;
    private boolean moveLeft;
    private boolean moveRight;

    public Enemy(int x, int y, int speed){
        super(x, y);
        this.speed = speed;
        moveLeft = false;
        moveRight = true;
    }

    public int getSpeed(){
        return speed;
    }
    public boolean getMoveLeft(){
        return moveLeft;
    }
    public boolean getMoveRight(){
        return moveRight;
    }
    public void setSpeed(int s){
        this.speed = s;
    }
    public void setMoveLeft(boolean ml){
        this.moveLeft = ml;
    }
    public void setMoveRight(boolean mr){
        this.moveRight = mr;
    }
}
