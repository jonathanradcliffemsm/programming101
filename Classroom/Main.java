import java.util.*;

public class Main {
	public static void main(String[] args){

        Classroom classroom = new Classroom();

        classroom.addStudent("Alex", 85);
        classroom.addStudent("James", 92);
        classroom.addStudent("Katy", 65);
        classroom.addStudent("John", 74);
        classroom.addStudent("Sarah", 96);
        classroom.addStudent("Dan", 45);

        int highestIndex = classroom.getHighestIndex();

        System.out.println("The student with the highest score is" + classroom.getNameByIndex(highestIndex) + " with " + classroom.getScoreByIndex(highestIndex) + "%");

	}
}
