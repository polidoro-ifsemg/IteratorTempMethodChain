package classes;

public class Game {
    private String name;
    private Integer requiredNumberRam;

    public Game(String name, Integer requiredNumberRam) {
        this.name = name;
        this.requiredNumberRam = requiredNumberRam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRequiredNumberRam() {
        return requiredNumberRam;
    }

    public void setRequiredNumberRam(Integer requiredNumberRam) {
        this.requiredNumberRam = requiredNumberRam;
    }

    private static Game game = new Game();

    private Game() {};

    public static Game getGame() {
        return game;
    }
}
