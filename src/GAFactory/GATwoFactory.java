package GAFactory;

import GAStrategy.*;


public class GATwoFactory implements GAFactory{

	@Override
	public CrossOver createCrossOver() {
		return new CrossOverTwo();
	}

	@Override
	public Mutation createMutation() {
		return new MutationTwo();
	}

	@Override
	public Selection createSelection() {
		return new SelectionTwo();
	}

}
