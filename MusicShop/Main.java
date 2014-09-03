import java.util.*;
public class Main {
	public static void main(String[] args){

		Shop shop = new Shop();

		shop.addCD("Korn", "Freak on a Leash", 1.99);
		shop.addCD("Nirvana", "Smells Like Teen Spirit", 0.99);
		shop.addCD("Deep Purple", "Smoke on the Water", 2.50);
        shop.addCD("Black Sabeth", "Paranoid", 1.25);
        shop.addCD("Faith No More", "Epic", 3.99);
        shop.addCD("Live", "I Alone", 0.75);
        shop.addCD("Foo Fighters", "Everlong", 1.00);
        shop.addCD("Presidents of the USA", "Peaches", 1.50);
        shop.addCD("The B52s", "Rock Lobster", 0.65);
        shop.addCD("ZZ Top", "La Grange", 0.75);

		shop.listAvailableCDs();
        String cheapest = shop.getCheapestCD();
		System.out.println("\nCheapest CD is " + cheapest + " by " + shop.getArtistByTitle(cheapest) + " at £" + shop.getPriceByTitle(cheapest));
	}
}
