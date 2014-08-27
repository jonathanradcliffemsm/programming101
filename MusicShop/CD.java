public class CD {
	private String songTitle;
	private String artist;
	private double price;

	//Constructor
	public CD(String songTitle, String artist, double price){
        this.songTitle = songTitle;
        this.artist = artist;
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