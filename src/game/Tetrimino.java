package game;

import framework.GameObject;

abstract class Tetrimino extends GameObject
{
    protected int[][] shape;
    protected int x;
    protected int y;

    protected Tetrimino(int[][] shape, int x, int y)
    {
        this.shape = shape;
        this.x = x;
        this.y = y;
    }

    public abstract void rotate();
    public abstract void moveLeft();
    public abstract void moveRight();
    public abstract void moveFastDrop();
    public abstract void moveSoftDrop();
    public abstract void hold();

    public int[][] getShape()
    {
        return this.shape;
    }
}
