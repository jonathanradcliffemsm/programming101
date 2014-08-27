import java.util.*;

public class Shop {

    private static List<CD> cds;

    public Shop(){
    	cds = new ArrayList<CD>();
    }

    public void addCD(String songTitle, String artist, double price){
    	CD cd = new CD(songTitle, artist, price);
    	cds.add(cd);
    }

    public void listAvailableCDs(){
        System.out.println("Available CDs:");
        for (int i=0; i<cds.size(); i++){
            CD cd = cds.get(i);
            System.out.println(cd.getSongTitle() + " by " + cd.getArtist() + " Price: " + cd.getPrice());
        }
    }

    public String getCheapestCD(){

    	double cheapestPrice = 9.99;
    	String cheapestCD = null;

    	System.out.print("Cheapest CD: ");
    	for (int i=0; i<cds.size(); i++){
    		CD cd = cds.get(i);
    		if (cd.getPrice()<cheapestPrice){
    			cheapestPrice=cd.getPrice();
    			cheapestCD=cd.getSongTitle();
    		}

    	}
    	return cheapestCD;
    	

    }


}