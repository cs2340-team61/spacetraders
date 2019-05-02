package edu.gatech.cs2340;
/**
 * Model Class
 */
public final class Model {
    private Game myGame;

    private static final Model instance = new Model();
    /**
     * Getter Method for model instance
     * @return instance
     */
    public static Model getInstance() { return instance; }

    private Model() {
        myGame = new Game();
    }
    /**
     * Getter Method for game
     * @return myGame
     */
    public Game getMyGame() { return myGame; }
    /**
     * Setter Method for player name
     * @param g game variable
     */
    public void setMyGame(Game g) { myGame = g; }

    public void clearGame() {
        myGame = new Game();
    }
}
