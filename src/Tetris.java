import framework.Game;
import framework.SceneController;
import game.TitleScene;

public class Tetris extends Game
{
    public Tetris()
    {
        super("Tetris");
    }

    public static void main(String[] args)
    {
        Tetris game = new Tetris();
        Game.launchGame(game);
    }

    @Override protected void onGameStart() 
    {
        this.loadFont("res/fonts/Tetris.ttf");
        TitleScene titleScreen = new TitleScene("Title");

        SceneController controller = this.getSceneController();
        controller.addScene(titleScreen);

        controller.setCurrentScene("Title");
    }
    
    @Override protected void onShutDown() 
    {
        // TODO Auto-generated method stub
    }
}
