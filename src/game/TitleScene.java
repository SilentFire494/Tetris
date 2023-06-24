package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;

import framework.Keyboard;
import framework.Scene;
import framework.Screen;

public class TitleScene extends Scene
{

    private Board board;

    public TitleScene(String name) 
    {
        super(name);
        this.board = new Board();
    }


    @Override
    public void load() 
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void unload() 
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void enter() 
    {
        System.out.println("Entered TitleScene");
    }

    @Override
    public void exit() 
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void processInputs(double secsPerFrame, Keyboard keys) 
    {
        if (keys.keyDownOnce(Keyboard.SPACE))
        {
            this.board.rotateCurrentTetrimino();
        }
        if (keys.keyDownOnce(Keyboard.LEFT))
        {
            this.board.moveCurrentTetriminoLeft();
        }
        if (keys.keyDownOnce(Keyboard.RIGHT))
        {
            this.board.moveCurrentTetriminoRight();
        }
        if (keys.keyDownOnce(Keyboard.DOWN))
        {
            this.board.hardDropCurrentTetrimino();
        }
    }

    @Override
    public void update(double secsPerFrame) 
    {
        this.board.update(secsPerFrame);
    }

    @Override
    public void render(Graphics2D g) 
    {
        //this.renderTitle(g);
        this.board.render(g);
    }

    private void renderTitle(Graphics2D g)
    {
        Font titleFont = new Font("Tetris", Font.PLAIN, 48);
        g.setFont(titleFont);
        FontMetrics fm = g.getFontMetrics();

        String title = "Tetris";
        int titleWidth = fm.stringWidth(title);
        int titleHeight = fm.getHeight();

        int screenW = Screen.getScreenWidth();
        int titleX = (screenW - titleWidth) / 2;

        g.setColor(new Color(192, 192, 192));
        g.drawString(title, titleX, titleHeight);
    }

    @Override
    public void onShutDown() 
    {
        // TODO Auto-generated method stub
    }
        
}
