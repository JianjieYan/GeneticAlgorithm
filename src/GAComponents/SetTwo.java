package GAComponents;

public class SetTwo implements SimultaneousSet{
	private  int len; //Num of Variable
	private  int ans[]= {585,459};
	
	
	private	int [] constants= {12,3,50,13,33,5};//[12,3,50] is constants for equation one. [13,33,5] is for equation two

	
	public SetTwo() {
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
