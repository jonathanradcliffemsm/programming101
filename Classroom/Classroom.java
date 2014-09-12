/**
 * Created by jonathan.radcliffe on 11/09/2014.
 */

import java.util.*;

public class Classroom {

    private static List<Student> students;

    public Classroom(){
        students = new ArrayList<Student>();
    }

    public void addStudent(String name, int score){
        Student student = new Student (name, score);
        students.add(student);
    }

    public void listScores(){
        System.out.println("Student scores:");
        for (int i=0; i<students.size(); i++){
            Student student = students.get(i);
            System.out.println(student.getName() + " scored " + student.getScore() + "%");
        }
    }


    public int getHighestIndex(){
        int highestScore = 0;
        int highestIndex = 0;
        for (int i=0; i<students.size(); i++){
            Student student = students.get(i);
            if (student.getScore()>highestScore){
                highestIndex = i-1;

            }

        }
        return highestIndex;
    }

    public int getScoreByIndex(int index){
        Student student = students.get(index);
        int score = student.getScore();
        return score;
    }

    public String getNameByIndex(int index){
        Student student = students.get(index);
        String name = student.getName();
        return name;
    }

    public String getHighestScorer(){

        int highestScore = 0;
        String highestScorer = null;

        for (int i=0; i<students.size(); i++){
            Student student = students.get(i);
            if (student.getScore()>highestScore){
                highestScore=student.getScore();
                highestScorer=student.getName();
            }

        }

        String scoreString = Integer.toString(highestScore);
        highestScorer = highestScorer + " " + Integer.toString(highestScore) + "%";
        return highestScorer;


    }


}
