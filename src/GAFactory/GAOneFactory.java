package GAFactory;

import GAStrategy.*;


public class GAOneFactory implements GAFactory{
	//Factory: concrete class handle the creation of a family of close related objects

	@Override
	public CrossOver createCrossOver() {
		return new CrossOverOne();
	}

	@Override
	public Mutation createMutation() {
		return new MutationOne();
	}

	@Override
	public Selection createSelection() {
		return new SelectionOne();
	}

}
