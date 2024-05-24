package singleton;

public class User {
    public static void main(String[] args) {
        // Testing the Singleton pattern
        CandyCrushRanking ranking1 = CandyCrushRanking.getInstance();
        System.out.println("First call to Instance() singleton: " + ranking1);

        System.out.println("Winner is: " + ranking1.getWinner());
        System.out.println("Loser is: " + ranking1.getLoser());

        System.out.println("Ranking 1:");
        ranking1.getRanking().forEach((player, score) -> {
            System.out.println(player + " has scored " + score + " points");
        });

        // Adding a new score
        ranking1.addScore("momo", 90);

        // Getting the instance again to show that it remains the same
        CandyCrushRanking ranking2 = CandyCrushRanking.getInstance();
        System.out.println("Second call to Instance() singleton: " + ranking2);

        System.out.println("Winner is: " + ranking2.getWinner());
        System.out.println("Loser is: " + ranking2.getLoser());

        System.out.println("Ranking 2:");
        ranking2.getRanking().forEach((player, score) -> {
            System.out.println(player + " has scored " + score + " points");
        });
    }
}
