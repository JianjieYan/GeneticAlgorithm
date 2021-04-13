package GAComponents;

public class SetOne implements SimultaneousSet {
	private  int len; //Num of Variable, depends on equation set
	private  int ans[]= {219,412};
	
	private	int [] constants= {12,3,50,4,13,33,5,5}; //{12,3,50,4} is the constants of one 
													 //of the linear equation, {13,33,5,5} is another one
 
	
	public SetOne() {
		this.len=constants.length;
		
			
	}
	 
	 public int[] getConstant() {
		return  constants;
	}
	
	public int getLen() {
		return len;
	}
	

	
	 
	public int[] getAns() {
		return ans;
	}
}
