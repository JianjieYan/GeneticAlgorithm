package GAComponents;
import java.util.Random;
public class Chromosome {
	private int gene [];
	private static int range;//search range. solution values are <=10
	public Chromosome() {}
	
	public Chromosome(int n) {
		int len=n/2;
		gene=new int[len];
		Random r=new Random();
		for(int i=0;i<len;i++) {
			gene[i]=r.nextInt(range);
		}
	}
	
	public static int getRange() {
		return range;
	}
	public static void setRange(int s) {
		range=s;
	}
	public int getGeneLen() {//not necessary
		return gene.length;
	}
	public int[] getGene() {
		return gene;
	}
	public void setGene(int []g) {
		gene=g;
	}
	
	
	
	public int getFitness(SimultaneousSet e) {//calculate fitness of solution (gene) with a given equation. The method must be in Chromosome class as they are closely-related
		fitness f=fitness.getInstance();
		return f.cal(e, gene);
	}

	

}
