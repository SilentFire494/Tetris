package game;

import java.awt.Color;
import java.awt.Graphics2D;

public class TetriminoI extends Tetrimino
{
    private int[][] shape0 = {
        { 0, 0, 0, 0 },
        { 1, 1, 1, 1 },
        { 0, 0, 0, 0 },
        { 0, 0, 0, 0 }
    };

    private int[][] shape90 = {
        { 0, 0, 1, 0 },
        { 0, 0, 1, 0 },
        { 0, 0, 1, 0 },
        { 0, 0, 1, 0 }
    };

    private int[][] shape180 = {
        { 0, 0, 0, 0 },
        { 0, 0, 0, 0 },
        { 1, 1, 1, 1 },
        { 0, 0, 0, 0 }
    };

    private int[][] shape270 = {
        { 0, 1, 0, 0 },
        { 0, 1, 0, 0 },
        { 0, 1, 0, 0 },
        { 0, 1, 0, 0 }
    };



    protected TetriminoI(Board board) 
    {
        super(new int[][] {
            { 0, 0, 0, 0 },
            { 1, 1, 1, 1 },
            { 0, 0, 0, 0 },
            { 0, 0, 0, 0 }
        }, Color.CYAN, board);
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
