import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Game {
    private String name;
    private int level;
    private int power;

    Game(String name, int level, int power){
        this.name = name;
        this.level = level;
        this.power = power;
    }
    public String getName(){return this.name;}
    public int getLevel(){return this.level;}
    public int getPower(){return this.power;}
}
// Stream , map, filter, sorted 이용
public class test4_412 {
    public static void main(String[] args) {
        Game game1 = new Game("James",10,3000);
        Game game2 = new Game("Alice",20,4000);
        Game game3 = new Game("Thomas",15,3500);

        List<Game> games = new ArrayList<Game>();
        games.add(game1);
        games.add(game2);
        games.add(game3);
        // 유저 네임 전체 출력

        System.out.println("[user name]");
        games.stream().map(u->u.getName())
                      .forEach(u-> System.out.println(u));

        // power 총합 출력
        System.out.println("[user power 합계]");
        System.out.println(games.stream()
                 .mapToInt(u -> u.getPower()).sum());

        // level15 이상인 유저 네임을 대문자로 바꾸고 정렬해서 출력
        System.out.println("[user level 15 이상]");
         games.stream().filter(u -> u.getLevel() >= 15)
                 .map(u -> u.getName())
                 .map(String::toUpperCase)
                 .sorted()
                 .forEach(u -> System.out.println(u));

    }
}
