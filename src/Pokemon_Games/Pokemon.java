package Pokemon_Games;

import Pokemon_Screen.GameScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class Pokemon extends Game {
    @Override
    public void create(){
     screen = new GameScreen(this);
     this.setScreen(screen);
    }
    @Override
    public  void render(){
        Gdx.gl.glClearColor(0f,0f,0f,1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        super.render();
    }
}
