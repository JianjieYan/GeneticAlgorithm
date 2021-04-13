package GAStrategy;
import java.util.Random;

import GAComponents.*;
public class MutationOne implements Mutation{
	public  Chromosome[] mutate(Chromosome []p) {
		Random r=new Random();
		int size=p[0].getGeneLen();//gene length
		
		for(int i=0;i<r.nextInt(20);i++) {//number of mutations
			int temp=r.nextInt(p.length);//size of the population
			int gene[]=p[temp].getGene();//on a random chromosome;

			for(int j=0; j<r.nextInt(10);j++) {//random times of gene changing of chosen chromosome.
				gene[r.nextInt(size)]=r.nextInt(Chromosome.getRange());//at random position of the gene;
				p[temp].setGene(gene);
			}
		}
		
		
		return p;
	
	}
}
