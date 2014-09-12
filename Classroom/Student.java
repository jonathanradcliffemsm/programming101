/**
 * Created by jonathan.radcliffe on 11/09/2014.
 */
public class Student {
    private String name;
    private int score;


    //Constructor
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    //Methods
    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

}