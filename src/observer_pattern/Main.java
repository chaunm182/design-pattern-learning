package observer_pattern;

public class Main {
    public static void main(String[] args) {
        Observer currentScoreDisplay = new CurrentScoreDisplay();
        Observer averageScoreDisplay = new AverageScoreDisplay();

        CricketData data = new CricketData();
        data.registerObserver(currentScoreDisplay);
        data.registerObserver(averageScoreDisplay);

        System.out.println("Change data:");
        data.setScore(2);
        data.notifyObserver();

        data.removeObserver(averageScoreDisplay);
        data.setScore(5);
        data.notifyObserver();
    }
}
