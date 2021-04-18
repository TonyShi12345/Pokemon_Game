package Pokemon_Games;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {

    public static void main(String[] args) {

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

        config.title="Pokemon game";
        config.height=400;
        config.width=600;
        config.vSyncEnabled=true;
        new LwjglApplication(new Pokemon(),config);
    }
}
