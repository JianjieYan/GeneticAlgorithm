package GAFactory;

import GAStrategy.*;

interface GAFactory {
	//Factory: creation of a family of close related objects
	public CrossOver createCrossOver();
	public Mutation createMutation();
	public Selection createSelection();
}
