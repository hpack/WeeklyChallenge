import java.util.Scanner;


public class WeeklyChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeeklyChallenge1 object = new WeeklyChallenge1();
		Scanner scanner = new Scanner(System.in); //scanner object
		

		System.out.println("Pick pattern 1, 2, or 3");
		
		int input = scanner.nextInt();
		
		System.out.println("How many lines do you want your pattern to be?");
		int input2 = scanner.nextInt();
		
		if (input == 1)
		{
			object.run1(input2);
		}
		
		if (input == 2)
		{
			object.run2(input2);
		}
		
		if (input == 3)
		{
			object.run3(input2);
		}
		

	}
	
		public void run1(int length)
		{
			String print = ("*");
			for (int i=1; i<length; i++)
			{	
				System.out.println(print);
				print += ("*");
			}
		}
		
		public void run2(int length)
		{
			int counter2 = 1;

			while (counter2<=2)
			{
			
				String printA = ("*");
				//String printS = ("     "); //5 spaces for the first line
				
				String printS = (" ");
				for (int i = 0; i<(length-1); i ++)
				{
					printS += (" ");
				}
				
				int counter = 1;
				
				for (int i=0; i<length; i++)
				{	
					System.out.println(printS + printA);
					printS = printS.substring(0,length-counter); //subtracts one character each line down
					counter++;
					printA += ("**");				
				}
				
				counter2++;
			}
		}
		
		public void run3(int length)
		{

			String printA = ("*");
			//String printS = ("     "); //5 spaces for the first line
			
			String printS = (" ");
			for (int i = 0; i<(length-1); i ++)
			{
				printS += (" ");
			}
			
			int counter = 1;
			
			for (int i=0; i<length; i++)
			{	
				System.out.println(printS + printA);
				printS = printS.substring(0,length-counter); //subtracts one character each line down
				counter++;
				printA += ("A*");
				
				
			}	
			
		}
	}



