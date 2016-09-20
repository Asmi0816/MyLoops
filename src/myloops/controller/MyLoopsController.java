package myloops.controller;

public class MyLoopsController 
{
	
	private int countDown;
	private String tommorow;
	
	public void start()
	{
		this.countDown = 23;
		this.tommorow = "Funner than life";
		while (countDown > 0 )
		{
			
			System.out.println("You have " + countDown + " Seconds left");
			countDown = countDown - 1;
		}
		System.out.println("You're outta time!");
		
		for (int index = 23; index >= 0; index--)
		{
			if (index == 17)
			{
				System.out.println(tommorow);
				
			}
			else 
			{
				System.out.println("      ");
			}
			System.out.println("What does this do really " + index);
		}
	}
	
}
	
