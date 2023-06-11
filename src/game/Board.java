package game;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import framework.GameObject;
import framework.Screen;

public class Board extends GameObject
{
    private int[][] cells;

    private double moveTimer;

    private static final int EMPTY_CELL = 0;
    private static final int FILLED_CELL = 1;
    private static final int CELL_SIZE = 20;

    private static final int BOARD_ROWS = 20;
    private static final int BOARD_COLS = 10;

    private Tetrimino currentTetrimino;
    private ArrayList<Tetrimino> placedTetriminos;
    private ArrayList<Tetrimino> futureTetriminos;


    public Board() 
    {
        this.cells = new int[BOARD_ROWS][BOARD_COLS];
        initializeBoard();
        this.currentTetrimino = new TetriminoL(this);
        this.placedTetriminos = new ArrayList<Tetrimino>();
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

    public void setCurrentTetrimino(Tetrimino tetrimino) 
    {
        this.currentTetrimino = tetrimino;
    }

    public Tetrimino getCurrentTetrimino() 
    {
        return this.currentTetrimino;
    }

    public void addPlacedTetrimino(Tetrimino tetrimino) 
    {
        this.placedTetriminos.add(tetrimino);
    }

    public ArrayList<Tetrimino> getPlacedTetriminos()
    {
        return this.placedTetriminos;
    }

    public void rotateCurrentTetrimino() 
    {
        this.currentTetrimino.rotate();
    }

    private void initializeBoard()
    {
        for (int row = 0; row < BOARD_ROWS; row++) 
        {
            for (int col = 0; col < BOARD_COLS; col++) 
            {
                this.cells[row][col] = EMPTY_CELL;
            }
        }
    }

    private Tetrimino getRandomTetrimino() 
    {
        int random = (int) (Math.random() * 7);
        switch (random) 
        {
            case 0:
                return new TetriminoI(this);
            case 1:
                return new TetriminoJ(this);
            case 2:
                return new TetriminoL(this);
            case 3:
                return new TetriminoO(this);
            case 4:
                return new TetriminoS(this);
            case 5:
                return new TetriminoT(this);
            case 6:
                return new TetriminoZ(this);
            default:
                return new TetriminoI(this);
        }
    }

    @Override
    public void update(double secsPerFrame) 
    {
        this.updateCurrentTetrimino(secsPerFrame);
        this.updateBoard(secsPerFrame);
    }

        private void updateCurrentTetrimino(double secsPerFrame)
    {
        if (this.moveTimer >= 0.1)
        {
            System.out.println(this.moveTimer);
            this.moveTimer = 0;
                        
            this.clearTetriminoPosition();
            this.currentTetrimino.moveDown();

            this.currentTetrimino.update(secsPerFrame);
        }
    }

    private void updateBoard(double secsPerFrame)
    {
        int[][] shape = this.currentTetrimino.getShape();
        int tetriminoRow = this.currentTetrimino.getRow();
        int tetriminoCol = this.currentTetrimino.getCol();
        for (int row = 0; row < shape.length; row++) 
        {
            for (int col = 0; col < shape[row].length; col++) 
            {
                if (shape[row][col] == FILLED_CELL) 
                {
                    this.setCell(tetriminoRow + row, tetriminoCol + col, FILLED_CELL);
                }
            }
        }
    }

    private void clearTetriminoPosition() 
    {
        int[][] shape = this.currentTetrimino.getShape();
        int tetriminoRow = this.currentTetrimino.getRow();
        int tetriminoCol = this.currentTetrimino.getCol();

        for (int row = 0; row < shape.length; row++) 
        {
            for (int col = 0; col < shape[row].length; col++) 
            {
                if (shape[row][col] == FILLED_CELL) {
                    this.setCell(tetriminoRow + row, tetriminoCol + col, EMPTY_CELL);
                }
            }
        }
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
                Color color = cellValue == EMPTY_CELL ? Color.WHITE : this.currentTetrimino.getColor(); // Example colors, change as desired

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
}
