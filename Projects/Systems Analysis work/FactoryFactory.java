import java.text.ParseException;

public abstract class FactoryFactory {
	//Abstract factory method is used in case we ever need to change our factory methods.
	//This can potentially allow the use of one factory method to perform both functions,
	// or the implementation of other factory methods or changing of functionalities.
	
	public abstract User createUser(String inputLine) throws ParseException;
	
	public abstract MediaItem createMediaItem(String inputLine) throws ParseException;

}
