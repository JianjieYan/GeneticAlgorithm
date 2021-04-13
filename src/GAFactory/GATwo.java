package GAFactory;


public class GATwo extends GA{

	public GATwo(GAFactory g) {
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
