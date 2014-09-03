public class CD {
	private String songTitle;
	private String artist;
	private double price;

	//Constructor
	public CD(String artist, String songTitle, double price){
        this.artist = artist;
        this.songTitle = songTitle;
        this.price = price;

    }

    //Methods
    public String getSongTitle(){
    	return this.songTitle;
    }

    public String getArtist(){
    	return this.artist;
    }

	public double getPrice(){
    	return this.price;
    }

}