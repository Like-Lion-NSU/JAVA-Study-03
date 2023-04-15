import java.util.ArrayList;
import java.util.List;
public class ch3likeline2 {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<>();
        games.add(new Game("James", 10, 3000));
        games.add(new Game("Alice", 20, 4000));
        games.add(new Game( "Thomas", 15, 3500));

        System.out.println("[game name]");
        games.stream()
                .map(game -> game.getName())
                .forEach(System.out::println);
        System.out.println();

        int powerSum = games.stream().mapToInt(Game::getPower).sum();
        System.out.println("[game power 합계]");
        System.out.println(powerSum);
        System.out.println();

        System.out.println("[game level 15 이상]");
        games.stream()
                .filter(game -> game.getLevel() >= 15)
                .map(Game::getName)
                .map(String::toUpperCase)
                .sorted()
                .forEach(name -> System.out.print(name + " "));
    }
}

