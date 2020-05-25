import java.util.ArrayList;

public class Wave {

    ArrayList<Enemy> wave;
    static int waveNum = 1;

    public Wave(){
        wave = new ArrayList<Enemy>();

        if (waveNum <= 5){ //The first 5 waves increase in length
            for (int i = 0; i <= waveNum - 1; i++) { //Adding one row for each new wave
                for(int t =0; t<= 9; t++){ //10 enemies per row
                    wave.add(new Enemy((50+t*50), (50+t*50), 10));
                }
            }
        }
        else{ //The following waves increase in speed
            for(int i=0;i <=4; i++){ //Adding the 5 rows
                for(int t=0; t<=9; t++){
                    wave.add(new Enemy((50+t*50), (50+t*50), 10+3*(waveNum-5)); //Adding 3 to the speed of each new wave
                }
            }
        }

        waveNum++;
    }

    public void moveWave(int screenWidth){
        for(Enemy e : wave){
            //move commands
            if(e.getMoveLeft())
                e.setX(e.getX() + e.getSpeed());
            if(e.getMoveRight())
                e.setX(e.getX() + e.getSpeed());
            //Check if the enemies arrived at an edge
            for(Enemy j : wave){
                if(e.getX()>screenWidth)
                    for(Enemy t : wave){
                        e.setMoveLeft(true); //turn move direction
                        e.setMoveRight(false);
                        e.setY(e.getY()+25); //going down
                    }
                if(e.getX()<0)
                    for(Enemy t : wave){
                        e.setMoveLeft(false); //turn move direction
                        e.setMoveRight(true);
                        e.setY(e.getY()+25); //going down
                    }
            }
        }
    }
}
