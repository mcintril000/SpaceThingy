import java.awt.*;

public class Player {

    int x, y;
    final int Width = 20, Height = 40;
    double speed, dx, dy;

    public Player(Board board){

        x = board.getWidth()/2;
        y = board.getHeight() - (Height+10);


    }

    public void moveRight(){
        x+=dx;
    }

    public void moveLeft(){
        x-=dx;
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x, y, Width, Height);
    }


public int getX(){
        return x;
}

public int getWidth(){
        return Width;
}

    public int getY(){
        return y;
    }
}
