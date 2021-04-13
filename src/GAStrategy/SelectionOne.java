package GAStrategy;
import GAComponents.*;
public class SelectionOne implements Selection{
	public Chromosome[] Select(Chromosome[] pop,SimultaneousSet e) {
		
		Chromosome[]result=new Chromosome[2];
		
		int fitnessArray[]=new int[pop.length];
	
			for(int i=0;i<pop.length;i++) {
				
				fitnessArray[i]=pop[i].getFitness(e);
		}
		int leastFit=0;
		int fittest=0;
		
		int temp=-2;//leastFit
		int temp2=555;//fittest
		for(int i=0;i<fitnessArray.length;i++) {
			if(fitnessArray[i]>temp) {
				temp=fitnessArray[i];
				leastFit=i;
			}
		}
		for(int i=0;i<fitnessArray.length;i++) {
			if(fitnessArray[i]<temp2) {
				temp2=fitnessArray[i];
				fittest=i;
			}
		}
		
		
		
		result[0]=pop[fittest];
		result[1]=pop[leastFit];
		
		return result;
	}
	
	public Chromosome leastFit(Chromosome[] pop,SimultaneousSet e) {
		
		Chromosome result=null;
		int fitnessArray[]=new int[pop.length];
	
			for(int i=0;i<pop.length;i++) {
				
				fitnessArray[i]=pop[i].getFitness(e);
		}
		int leastFit=0;
		int temp=-2;//leastFit
		for(int i=0;i<fitnessArray.length;i++) {
			if(fitnessArray[i]>temp) {
				temp=fitnessArray[i];
				leastFit=i;
			}
		}
		
		
		
		
		result=pop[leastFit];
		
		return result;
		
	}

}
