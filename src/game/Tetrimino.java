package game;
import java.awt.Color;

import framework.GameObject;

public abstract class Tetrimino extends GameObject
{
    private int[][] shape;
    private Color color;
    private int row;
    private int col;

    protected Tetrimino(int[][] shape, Color color)
    {
        this.shape = shape;
        this.color = color;
        row = 0;
        col = 0;
    }

    public int[][] getShape() 
    {
        return shape;
    }

    public Color getColor() 
    {
        return color;
    }

    public int getRow() 
    {
        return row;
    }

    public int getCol() 
    {
        return col;
    }

    public void setRow(int row) 
    {
        this.row = row;
    }

    public void setCol(int col) 
    {
        this.col = col;
    }

    public abstract void moveDown();

    public abstract void moveLeft();

    public abstract void moveRight();

    public abstract void rotate();
}
