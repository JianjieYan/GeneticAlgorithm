/*
 * This class is used to calculate the fitness of a chromosome for any given equation. 
 * 
 * There are many chromosome instances will be created, so it is necessary to set the fitness class singleton and make sure only one instance is created.
 * One instance of the fitness class is enough for all the calculations from Chromosome, so no point to create multiple instance; 
 *
*/

package GAComponents;
public class fitness {
	private static fitness instance;
	private fitness(){}
	
	public static synchronized fitness getInstance(){
        if(instance == null){
            instance = new fitness();
        }
        return instance;
    }
	public int cal(SimultaneousSet e2,int[]gene) {
		int []Ans=e2.getAns();
		int score=0;

		if(Ans.length==2) {
			int ans1 = Ans[0];
			int ans2=Ans[1];
			int constant[]=e2.getConstant();
			int result1=0;
			int result2=0;
			int count=0;
			for(int i=0;i<(constant.length/2);i++) {
				result1+=constant[i]*gene[count];
				count++;
				
			}
			count=0;
			for(int i=(constant.length/2);i<constant.length;i++) {
				result2+=constant[i]*gene[count];
				count++;
			}
			
				score=Math.abs(result1-ans1)+Math.abs(result2-ans2);
			
		}
		else  {
			int ans=Ans[0];
			int res=0;
			int [] c=e2.getConstant();
			for(int i=0;i<gene.length;i++) {
				res+=gene[i]*c[i];
			}
			score=Math.abs(res-ans);
		}
			
		return score;
		
	}

	
}
