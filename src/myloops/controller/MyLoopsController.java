package myloops.controller;

public class MyLoopsController 
{
	
	private int countDown;
	private String tommorow;
	private boolean master;
	
	public void start()
	{
		this.countDown = 23;
		this.tommorow = "Funner than life";
		this.master = true;
		
		while (countDown > 0 )
		{
			
			System.out.println("You have " + countDown + " Seconds left");
			countDown = countDown - 1;
		}
		System.out.println("You're outta time!");
		
		while (countDown == 0)
		{
			System.out.println("whoops removed too many!");
			countDown = countDown + 1;
		}
		System.out.println("fixed");
		
		for (int index = 23; index >= 0; index--)
		{
			if (index == 17)
			{
				System.out.println(tommorow);
				if (tommorow.equals("Funner than life"))
				{
					tommorow = "No longer any fun";
					if (master == false)
					{
						System.out.println(tommorow);
						if (tommorow.equalsIgnoreCase("No longer any fun"))
						{
							countDown = 0;
						}
						else if (tommorow.equals("name"))
						{
							System.out.println("no this shouldnt show");
						}
						
						else
						{
							tommorow = "this is random giberish no one will see";
						}
					}
					else 
					{
						System.out.println("You are a special and wonderful person with a hear that could ecncompase the Earth and moon and further");
					
					}
				}
			}
			else 
			{
				
				System.out.println("      ");
			}
			System.out.println("What does this do really " + index);
		}
		for (int index = 2; index >=0; index--)
		{
			System.out.println("Exceeding requirements");
		}
	}
	
}
	
