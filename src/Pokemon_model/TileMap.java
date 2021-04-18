package Pokemon_model;

public class TileMap {
    private int width,height;
    private Tile[][] tile;

    public TileMap(int width, int height){
        this.width = width;
        this.height = height;
        tile = new Tile[width][height];
        for (int x =0;x<width;x++){
            for(int y =0;y<height;y++){
                if(Math.random()>0.5d){
                    tile[x][y] = new Tile(TERAIN.GRASS_1);
                }
                else {
                    tile[x][y] = new Tile(TERAIN.GRASS_2);
                }

            }
        }
    }
    public Tile getTile(int x,int y){
        return tile[x][y];
    }
    public int getWith(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}
