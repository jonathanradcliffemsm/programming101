import java.util.*;
public class Main {
	public static void main(String[] args){

		Shop shop = new Shop();

		shop.addCD("Korn", "Freak on a Leash", 1.99);
		shop.addCD("Nirvana", "Smells Like Teen Spirit", 0.99);
		shop.addCD("Deep Purple", "Smoke on the Water", 2.50);

		shop.listAvailableCDs();
		System.out.println("Cheapest CD is " + shop.getCheapestCD());
	}
}
