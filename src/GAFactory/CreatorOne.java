package GAFactory;

public class CreatorOne extends Creator{
	//creator type one;
	@Override
	public GA createGA(String ga) {
		GA g=null;
		if(ga.equals("One")) {
			GAFactory f=new GAOneFactory();

			g=new GAOne(f);
		}
		g.combine();
		return g;
	}

}
