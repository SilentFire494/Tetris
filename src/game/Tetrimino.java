package game;
import java.awt.Color;

import framework.GameObject;

public abstract class Tetrimino extends GameObject
{
    private int[][] shape;
    private Color color;
    protected int row;
    private int col;
    private int rotation;
    

    private Board board;

    private static final int FILLED_CELL = 1;
    private static final int EMPTY_CELL = 0;

    protected Tetrimino(int[][] shape, Color color, Board board)
    {
        this.board = board;
        this.shape = shape;
        this.color = color;
        this.row = 0;
        this.col = 0;
        this.rotation = 0;
    }

    public int getRow() 
    {
        return this.row;
    }

    public void setRow(int row) 
    {
        this.row = row;
    }

    public int getCol() 
    {
        return this.col;
    }

    public void setCol(int col) 
    {
        this.col = col;
    }

    public Color getColor() 
    {
        return this.color;
    }

    public int[][] getShape() 
    {
        return this.shape;
    }

    public  void moveLeft()
    {
        this.col--;
    }


    public  void moveRight()
    {
        this.col++;
    }

    public  void moveDown()
    {
        this.row++;
    }

    public void rotate() 
    {
        int nextRotation = (rotation + 90) % 360;
        int[][] nextShape = getShapeForRotation(nextRotation);
        int originalRow = row;
        int originalCol = col;

        // Clear the current position of the tetrimino on the board
        clearTetriminoPosition();

        // Move the piece horizontally if it collides with the bounds after rotation
        while (isCollidingWithBounds(nextShape)) 
        {
            col--;
            if (col < 0) 
            {
                col = 0;
                break;
            }
        }

        // Update the shape and rotation
        shape = nextShape;
        rotation = nextRotation;

        // Check if the new position collides with the bounds
        if (isCollidingWithBounds(shape)) 
        {
            // Restore the original position if it collides
            shape = getShapeForRotation(rotation);
            row = originalRow;
            col = originalCol;
        }

        // Set the tetrimino's cells on the board with the new position
        setTetriminoPosition();
    }

    private void clearTetriminoPosition() 
    {
        for (int row = 0; row < shape.length; row++) 
        {
            for (int col = 0; col < shape[row].length; col++) 
            {
                if (shape[row][col] == FILLED_CELL) 
                {
                    board.setCell(this.row + row, this.col + col, EMPTY_CELL);
                }
            }
        }
    }

    private void setTetriminoPosition() 
    {
        for (int row = 0; row < shape.length; row++) 
        {
            for (int col = 0; col < shape[row].length; col++) 
            {
                if (shape[row][col] == FILLED_CELL) 
                {
                    board.setCell(this.row + row, this.col + col, FILLED_CELL);
                }
            }
        }
    }

    private boolean isCollidingWithBounds(int[][] nextShape) 
    {
        for (int row = 0; row < nextShape.length; row++) 
        {
            for (int col = 0; col < nextShape[row].length; col++) 
            {
                if (nextShape[row][col] == FILLED_CELL) 
                {
                    int boardRow = row + this.row;
                    int boardCol = col + this.col;

                    if (boardRow < 0 || boardRow >= this.board.getRows() || boardCol < 0 || boardCol >= this.board.getCols()) 
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    protected abstract int[][] getShapeForRotation(int rotation);
}
