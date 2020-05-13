package observer_pattern;

public class CurrentScoreDisplay implements Observer {
    private Integer score;

    @Override
    public void update(Integer score) {
        this.score = score;
        display();
    }

    public void display(){
        System.out.println("CurrentScoreDisplay: "+score);
    }


}
