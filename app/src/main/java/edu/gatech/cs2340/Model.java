package edu.gatech.cs2340;

public class Model {
    private Game myGame;

    private static Model instance = new Model();

    public static Model getInstance() { return instance; }

    private Model() {
        myGame = new Game();
    }

    public Game getMyGame() { return myGame; }
}
