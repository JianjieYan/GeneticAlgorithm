package GAStrategy;
import java.util.Random;

import GAComponents.Chromosome;
public class CrossOverTwo implements CrossOver{
	
	public  Chromosome []getOffSpring(Chromosome parent1,Chromosome parent2) {
		Chromosome result[]=new Chromosome[2];
		Random r=new Random();
		int len=parent1.getGeneLen();
		
		int crossOverPoint=r.nextInt(len);
		int gene1[]=parent1.getGene();
		int gene2[]=parent2.getGene();
		int temp[]=gene1;
		for(int i=0;i<crossOverPoint;i++) {
			gene1[i]=gene2[i];
			gene2[i]=temp[i];
		}
		Chromosome child1=new Chromosome();
		Chromosome child2=new Chromosome();
		child1.setGene(gene2);
		child2.setGene(gene1);
		
		result[0]=child1;

		result[1]=child2;
		return result;
	}

	

}
