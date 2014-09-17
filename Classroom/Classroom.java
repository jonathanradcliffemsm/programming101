/**
 * Created by jonathan.radcliffe on 11/09/2014.
 */

import java.util.*;

public class Classroom {

    private static ArrayList<Student> students;

    public Classroom(){
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        students.add(student);
    }


    public Student getHighestStudent(){
        int highestScore = 0;
        Student highestStudent = null;
        for (int i=0; i<students.size(); i++){
            Student student = students.get(i);
            if (student.getScore()>highestScore){
                highestScore = student.getScore();
                highestStudent = student;

            }

        }
        return highestStudent;
    }


}
