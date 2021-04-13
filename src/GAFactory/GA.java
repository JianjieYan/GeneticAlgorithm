package GAFactory;

import java.util.Arrays;
import java.util.Random;

import GAComponents.*;
import GAStrategy.*;


public abstract class GA {
	//context;
	
	protected Selection s;//Strategy object
	protected CrossOver c;//Strategy object
	protected Mutation m;//Strategy object
	protected GAFactory f;//factory object used to create the strategy object
	
	
	public abstract void combine();
	
	public  void run(population ref) { 
			
			Chromosome [] p=ref.getPopulation();
			System.out.println(ref.getEquation().getClass().getSimpleName());
			SimultaneousSet e=ref.getEquation();
			Random r=new Random();
			int counter=0;
			boolean b=false;
			
			while(b==false) {
				counter++;
				
				Chromosome[] t=s.Select(p,e);
	
				if(t[0].getFitness(e)==0&&e.getAns().length==2) {
					b=true;
					System.out.println("Round: "+counter+" Solution: "+Arrays.toString(t[0].getGene())+"fitness: "+t[0].getFitness(e)
							+" Answer: "+ e.getAns()[0] +" " +e.getAns()[1] +" Equation: "+e.getClass().getSimpleName()+"\n");
	
	
				}
				
	
				
				Chromosome childs[]=new Chromosome[2];
				
				
				childs=c.getOffSpring(t[0],t[1]);
				Chromosome leastFit=s.leastFit(p, e);
				
				for(int i=0;i<5;i++) {//Reset the chromosome of population to the ones selected by Selection class;
					
					if(p[i]==t[0]) { //replace fittest with one of offspring;
						p[i]=childs[1]; 
					}
					if(p[i]==leastFit) { //replace least fit with another one
						p[i]=childs[0];
					}
				}
				//doing a mutation
				int temp=r.nextInt(2);
				if(temp==1) {
					p=m.mutate(p);
				}
				
				
				
			}
		}
	public void setMutation(Mutation m1) {
		m=m1;
	}
	public void setFactory(GAFactory g) {
		f=g;
	}
	public void setSelection(Selection s1) {
		s=s1;
	}
	public void setCrossOver(CrossOver c1) {
		c=c1;
	}

	
	
}
