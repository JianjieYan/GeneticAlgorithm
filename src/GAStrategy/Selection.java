package GAStrategy;

import GAComponents.*;

public interface Selection {
	public Chromosome[] Select(Chromosome[] pop,SimultaneousSet e);
	public Chromosome leastFit(Chromosome[] pop,SimultaneousSet e);

	
}
