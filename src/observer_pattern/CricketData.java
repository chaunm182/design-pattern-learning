package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject {
    private Integer score;
    private List<Observer> observers;

    public CricketData() {
        observers = new ArrayList<>();
        score = 1;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("Observer successfully added");
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println("Observer successfully removed");
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(score);
        }
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
