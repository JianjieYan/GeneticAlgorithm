package GAFactory;


public class GAOne extends GA{

	public GAOne(GAFactory g) {
		f=g;	
	}
//use the factory object to create Strategy object;
	@Override
	public void combine() {
		s=f.createSelection();
		c=f.createCrossOver();
		m=f.createMutation();
		
	}
	
	
	
}
