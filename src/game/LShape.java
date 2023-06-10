package game;

import java.awt.Graphics2D;

public class LShape  extends Tetrimino
{
    protected LShape() 
    {
        super(new int[][] {
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        }, 0, 0);
    }

    @Override
    public void rotate()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rotate'");
    }

    @Override
    public void moveLeft()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveLeft'");
    }

    @Override
    public void moveRight()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveRight'");
    }

    @Override
    public void moveFastDrop()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveFastDrop'");
    }

    @Override
    public void moveSoftDrop()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveSoftDrop'");
    }

    @Override
    public void hold()
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hold'");
    }

    @Override
    public void update(double delta) 
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void render(Graphics2D g) 
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'render'");
    }
        
}
