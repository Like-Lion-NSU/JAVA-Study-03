public class Game {
    private String name;
    private int level;
    private int power;

    public Game(String name, int level, int power) {
        this.name = name;
        this.level = level;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getPower() {
        return power;
    }
}
