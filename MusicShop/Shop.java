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

    	for (int i=0; i<cds.size(); i++){
    		CD cd = cds.get(i);
    		if (cd.getPrice()<cheapestPrice){
    			cheapestPrice=cd.getPrice();
    			cheapestCD=cd.getSongTitle();
    		}

    	}
    	return cheapestCD;
    	

    }

    public double getPriceByTitle(String songTitle){
        double cheapest = 0.00;

        for (int i=0; i<cds.size(); i++){
            CD cd = cds.get(i);
            if (cd.getSongTitle()==songTitle){
                 cheapest = cd.getPrice();
            }

        }

        return cheapest;

    }

    public String getArtistByTitle(String songTitle){
        String artist = null;

        for (int i=0; i<cds.size(); i++){
            CD cd = cds.get(i);
            if (cd.getSongTitle()==songTitle){
                artist = cd.getArtist();
            }

        }

        return artist;

    }


}