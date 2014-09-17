import java.util.*;

public class Main {

        public static void main(String[] args){

                Classroom classroom = new Classroom();

                classroom.addStudent(new Student("Alex", 85));
                classroom.addStudent(new Student("James", 92));
                classroom.addStudent(new Student("Katy", 65));
                classroom.addStudent(new Student("John", 74));
                classroom.addStudent(new Student("Sarah", 96));
                classroom.addStudent(new Student("Dan", 45));

                Student highestStudent = classroom.getHighestStudent();
                System.out.println("The student with the highest score is " + highestStudent.name + " with " + highestStudent.score + "%");
	}
}
