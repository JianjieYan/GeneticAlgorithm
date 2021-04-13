package Client;


import GAComponents.*;
import GAFactory.*;
public class Runner {
	public static void main(String[]args) {

		Creator c=new CreatorOne();
		GA g1=c.createGA("One");

		SetOne e=new SetOne();
		population <SetOne>p=new population<>(5,e); //5 is number of chromosomes of population. and e is equation set for the population.
		g1.run(p);
		
		
		SetTwo e2=new SetTwo();
		population<SetTwo> p2=new population<>(5,e2);
		g1.run(p2);
		
	
		
		
		
	}	
}
