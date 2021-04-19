package Pokemon_Screen;

import Pokemon_Controller.PlayerController;
import Pokemon_Games.Pokemon;
import Pokemon_Games.Setting;
import Pokemon_model.Actor;
import Pokemon_model.TERAIN;
import Pokemon_model.TileMap;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends AbstractScreen+1{
    private Actor actor;
    private TileMap map;
    private Texture standsouth;
    private Texture gress1;
    private Texture gress2;
    private SpriteBatch batch;
    private PlayerController controller;
    public GameScreen(Pokemon app){
        super(app);
        standsouth = new Texture("images/front0.png");
        gress1 = new Texture("images/grass.jpg");
        gress2 = new Texture("images/grass1.jpg");
        batch = new SpriteBatch();
        map = new TileMap(10,10);
        actor = new Actor(map,0,0);
        controller = new PlayerController(actor);
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(controller);
    }

    @Override
    public void render(float delta) {
        batch.begin();
        for(int x=0;x<map.getWith();x++){
            for(int y=0;y<map.getWith();y++){
                Texture rander;
                if(map.getTile(x,y).getTerain()== TERAIN.GRASS_1){
                     rander = gress1;
                }
                else{
                    rander = gress2;
                }
               batch.draw(rander,x*Setting.SCALE_TILE_SIZE,y*Setting.SCALE_TILE_SIZE,Setting.SCALE_TILE_SIZE,Setting.SCALE_TILE_SIZE);
            }
        }

        batch.draw(standsouth,
                actor.getX()* Setting.SCALE_TILE_SIZE,
                actor.getY()* Setting.SCALE_TILE_SIZE,
                Setting.SCALE_TILE_SIZE,
                Setting.SCALE_TILE_SIZE*1.5f );
        batch.end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
