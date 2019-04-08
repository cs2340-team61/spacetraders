package edu.gatech.cs2340;

public final class Model {
    private Game myGame;

    private static final Model instance = new Model();

    public static Model getInstance() { return instance; }

    private Model() {
        myGame = new Game();
    }

    public Game getMyGame() { return myGame; }
    public void setMyGame(Game g) { myGame = g; }
}
