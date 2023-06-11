package game;
import java.awt.Color;
import java.awt.Graphics2D;

import framework.GameObject;
import framework.Screen;

public class Board extends GameObject
{
    private int[][] cells;

    private static final int EMPTY_CELL = 0;
    private static final int FILLED_CELL = 1;
    private static final int CELL_SIZE = 20;

    private static final int BOARD_ROWS = 20;
    private static final int BOARD_COLS = 10;


    public Board() 
    {
        cells = new int[BOARD_ROWS][BOARD_COLS];
        initialize();
    }

    public int getRows() 
    {
        return BOARD_ROWS;
    }

    public int getCols() 
    {
        return BOARD_COLS;
    }

    public void setCell(int row, int col, int value) 
    {
        this.cells[row][col] = value;
    }

    public int getCell(int row, int col) 
    {
        return this.cells[row][col];
    }

    private void initialize() 
    {
        for (int row = 0; row < BOARD_ROWS; row++) 
        {
            for (int col = 0; col < BOARD_COLS; col++) 
            {
                cells[row][col] = EMPTY_CELL;
            }
        }
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
        this.renderBoard(g);
    }

    private void renderBoard(Graphics2D g)
    {
        for (int row = 0; row < BOARD_ROWS; row++) 
        {
            for (int col = 0; col < BOARD_COLS; col++) 
            {
                int cellValue = cells[row][col];
                Color color = cellValue == EMPTY_CELL ? Color.WHITE : Color.BLUE; // Example colors, change as desired

                //draw in the center of the `screen
                int x = (Screen.getScreenWidth() - BOARD_COLS * CELL_SIZE) / 2 + col * CELL_SIZE;
                int y = (Screen.getScreenHeight() - BOARD_ROWS * CELL_SIZE) / 2 + row * CELL_SIZE;

                g.setColor(color);
                g.fillRect(x, y, CELL_SIZE, CELL_SIZE);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, CELL_SIZE, CELL_SIZE);
            }
        }
    }

    // Other methods for manipulating and querying the board
}
