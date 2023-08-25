package datastructures.src.com.interview.javaspecific;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Player {

    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Raj", 120));
        players.add(new Player("John", 80));
        players.add(new Player("David", 180));

        System.out.println("Unsorted list:");
        players.forEach(player -> System.out.println(player.getName() + ": " + player.getScore()));

        Comparator<Player> scoreComparator = Comparator.comparingInt(Player::getScore).reversed();

        players.sort(scoreComparator);

        System.out.println("\nSorted list based on scores:");
        players.forEach(player -> System.out.println(player.getName() + ": " + player.getScore()));

    }
}
