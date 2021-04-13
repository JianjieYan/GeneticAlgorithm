package GAComponents;

public class population<T extends SimultaneousSet>{ //Generic 
	private Chromosome [] population;
	T equation;
	private int geneLen;
	private int searchRange=10;
	public population(int n,T e) {
		population =new Chromosome[n];
		equation=e;
		geneLen=e.getLen();
		Chromosome.setRange(searchRange);//set up search range; 

		for(int i=0;i<n;i++) {
			population[i]=new Chromosome(geneLen); //set up gene length of each chromosome;
			}		
	}
	
	public void setRange(int range) {
		searchRange=range;
	}
	public Chromosome[] getPopulation() {
		return population;
	}
	public T getEquation() {
		return equation;
	}
	public void setEquation(T e) {
		this.equation=e;

		geneLen=e.getLen();
		
		for(int i=0;i<population.length;i++) {
			population[i]=new Chromosome(geneLen);

		}
		
	}
	

	

}
