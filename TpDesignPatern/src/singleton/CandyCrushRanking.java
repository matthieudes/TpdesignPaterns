package singleton;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CandyCrushRanking {
    private static CandyCrushRanking instance = null;
    private Map<String, Integer> scores = new HashMap<String, Integer>();

    public CandyCrushRanking() {
        this.scores.put("bibi",300);
        this.scores.put("pepette",234);
        this.scores.put("boulboul",209);
        this.scores.put("safinette",202);
        this.scores.put("skymed",177);
        this.scores.put("choupette",78);
        this.scores.put("mimi",50);
    }

    public static  CandyCrushRanking getInstance() {
        if (instance == null) {
            instance = new CandyCrushRanking();
        }
        return instance;
    }

    public void addScore(String player, int score) {
        scores.put(player, score);
    }

    public void removeScore(String player) {
        scores.remove(player);
    }

    public String getWinner() {
        return Collections.max(scores.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public String getLoser() {
        return Collections.min(scores.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    // Method to get the ranking map
    public Map<String, Integer> getRanking() {
        return new HashMap<>(scores);
    }

}