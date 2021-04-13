package GAFactory;

public class CreatorTwo extends Creator{
	//creator type Two;

	@Override
	public GA createGA(String ga) {
		GA g=null;
		GAFactory f=new GATwoFactory();
		if(ga.equals("Two")) {
			g=new GATwo(f);
		}
		g.combine();
		return g;
	}

}
