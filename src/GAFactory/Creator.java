package GAFactory;

public abstract class Creator {
	//different types of creator is allowed for different GA
	public abstract GA createGA(String ga);
}
