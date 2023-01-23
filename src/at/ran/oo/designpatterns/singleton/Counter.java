package at.ran.oo.designpatterns.singleton;

public class Counter {
    private int score;
    public static Counter instance = null;
    private Counter(){

    }

    public static Counter getSingleton(){
        if (instance==null){
            instance = new Counter();
        }
        return instance;
    }
    public void increaseScore(){
        this.score++;

    }

    public int getScore() {
        return score;
    }


}
