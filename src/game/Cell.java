package game;
import java.awt.Color;

public class Cell 
{
    private Color color;
    
    private int value;

    public Cell() 
    {
        this.color = Color.WHITE;
        this.value = 0;
    }

    public Color getColor() 
    {
        return this.color;
    }

    public void setColor(Color color) 
    {
        this.color = color;
    }

    public int getValue() 
    {
        return this.value;
    }

    public void setValue(int value) 
    {
        this.value = value;
    }
}
