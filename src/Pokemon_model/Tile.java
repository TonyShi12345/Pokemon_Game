package Pokemon_model;

public class Tile {
    private TERAIN terain;
    private Actor actor;

    public Tile(TERAIN terain) {
        this.terain = terain;
    }


    public TERAIN getTerain(){
        return terain;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
