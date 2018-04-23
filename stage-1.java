import java.util.Scanner;

public class stage_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String option ;
		int startpop;
		int Fixednumberofgeneration ;
		final int variablenumberofgeneration=10;
		final int CAPACITY=5000;
		double[] iaRate = new double[10];
		int FixedGRate;
		int Finalpopulation =0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter Starting Population");
		
		startpop = in.nextInt();
		
		System.out.println("Please Enter F for Fixed Growth or V for Variable Growth");
		
		option=in.next();
		
		if(option.equals("F"))
		{
		System.out.println("Please Enter the number of Generation");
		Fixednumberofgeneration = in.nextInt();
		
		System.out.println("Please Enter the Fixed Growth Rate");
		FixedGRate = in.nextInt();
		
		Finalpopulation = startpop+(startpop*FixedGRate/100);
		
		for(int i=1;i<Fixednumberofgeneration;i++)
		{
			Finalpopulation=Finalpopulation+(Finalpopulation*FixedGRate/100);
		}
		System.out.println("Finalpopulation is" +Finalpopulation );
		}
		
		else if(option.equals("V"))
		{
			for(int i=0;i<variablenumberofgeneration;i++)
			{
				System.out.println("Please Enter the Growth rate for " + i + "Generation");
				iaRate[i]= in.nextInt();
			}
		}
		
	}

}