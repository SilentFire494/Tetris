package game;

import java.awt.Color;
import java.awt.Graphics2D;

public class TetriminoS extends Tetrimino
{

    protected TetriminoS() 
    {
        super(new int[][] {
            { 0, 1, 1 },
            { 1, 1, 0 },
            { 0, 0, 0 }
        }, Color.GREEN);
    }

    @Override
    public void update(double delta) 
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void render(Graphics2D g) 
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void moveDown() 
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void moveLeft() 
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void moveRight() 
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void rotate() 
    {
        // TODO Auto-generated method stub
    }
    
}
