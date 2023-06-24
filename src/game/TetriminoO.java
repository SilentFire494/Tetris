package game;

import java.awt.Color;
import java.awt.Graphics2D;

public class TetriminoO extends Tetrimino
{
    private int[][] shape0 = {
        { 1, 1 },
        { 1, 1 }
    };

    private int[][] shape90 = {
        { 1, 1 },
        { 1, 1 }
    };

    private int[][] shape180 = {
        { 1, 1 },
        { 1, 1 }
    };

    private int[][] shape270 = {
        { 1, 1 },
        { 1, 1 }
    };

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
    }

    protected int[][] getShapeForRotation(int rotation) 
    {
        switch (rotation) {
            case 0:
                return shape0;
            case 90:
                return shape90;
            case 180:
                return shape180;
            case 270:
                return shape270;
            default:
                return this.getShape();
        }
    }
    
}
