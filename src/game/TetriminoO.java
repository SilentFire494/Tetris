package game;

import java.awt.Color;
import java.awt.Graphics2D;

public class TetriminoO extends Tetrimino
{

    protected TetriminoO(Board board) 
    {
        super(new int[][] {
            { 1, 1 },
            { 1, 1 }
        }, Color.YELLOW, board);
    }

    @Override
    public void update(double secsPerFrame) 
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
    protected int[][] getShapeForRotation(int rotation) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getShapeForRotation'");
    }
    
}