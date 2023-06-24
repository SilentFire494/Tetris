package game;

import java.awt.Color;
import java.awt.Graphics2D;

public class TetriminoL extends Tetrimino
{
    private static final int[][] SHAPE_0 = {
        { 0, 1, 0 },
        { 0, 1, 0 },
        { 0, 1, 1 }
    };

    private static final int[][] SHAPE_90 = {
        { 0, 0, 1 },
        { 1, 1, 1 },
        { 0, 0, 0 }
    };

    private static final int[][] SHAPE_180 = {
        { 1, 1, 0 },
        { 0, 1, 0 },
        { 0, 1, 0 }
    };

    private static final int[][] SHAPE_270 = {
        { 0, 0, 0 },
        { 1, 1, 1 },
        { 1, 0, 0 }
    };

    protected TetriminoL(Board board) 
    {
        super(new int[][] {
            { 0, 0, 1 },
            { 1, 1, 1 },
            { 0, 0, 0 }
        }, Color.ORANGE, board);
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
                return SHAPE_0;
            case 90:
                return SHAPE_90;
            case 180:
                return SHAPE_180;
            case 270:
                return SHAPE_270;
            default:
                return this.getShape();
        }
    }
    
}
