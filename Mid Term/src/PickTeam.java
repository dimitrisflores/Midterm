
import java.util.ArrayList;
import java.util.Scanner;
public class PickTeam
	{
	static ArrayList<Player> draft = new ArrayList<Player>();
	static ArrayList<Player> team = new ArrayList<Player>();
	public static void main(String[] args)
		{
		makingRoster();
		introduction();
		pickQuarterback();
		pickWideReciever();
		pickRunningBack();
		yourTeam();
		}
	public static void makingRoster()
		{
		draft.add(new Player("Tom Brady", "New England Patriots", "Quarterback", 12));
		draft.add(new Player("Dak Prescott", "Dallas Cowboys", "Quarterback", 4));
		draft.add(new Player("Aaron Rodgers", "Greenbay Packers", "Quarterback", 12));
		draft.add(new Player("Dez Bryant", "Dallas Cowboys", "Wide Reciever", 88));
		draft.add(new Player("Julio Jones", "Atlanta Falcons", "Wide Reciever", 11));
		draft.add(new Player("Odell Beckham Jr", "New York Giants", "Wide Reciever", 13));
		draft.add(new Player("DeMarco Murray", "Tennnessee Titans", "Running Back", 29));
		draft.add(new Player("Ezekiel Elliot", "Dallas Cowboys", "Running Back", 21));
		draft.add(new Player("Adrian Peterson", "Minnesota Vikings", "Running Back", 28));
		}
	public static void introduction()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello player what is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello, " + name+ "! Are you ready to draft players in the NFL?");
		String player = userInput.nextLine();
		if(player.equals("yes"))
			{
			System.out.println("Cool let's begin!");	
			}
		else
			{
			System.out.println("Ok feel free to come back if you change your mind!");
			}
		}
	public static void pickQuarterback()
		{
		System.out.println("Ok first off you need a quarterback!");
		System.out.println("Select a quarterback 1, 2, or 3!");
		for (int i = 0; i <= 2; i++)
			{
			System.out.println((i+1) + ") " + draft.get(i).getName() + " for the " + draft.get(i).getTeam() + " with the number " + draft.get(i).getNumber());
			}
		Scanner userInput = new Scanner(System.in);
		String quarterBack = userInput.nextLine();
		if(quarterBack.equals("1"))
			{
			System.out.println("Nice choice he is a very good quarterback that will when you many games!");
			team.add(draft.get(0));
			}
		else if (quarterBack.equals("2"))
			{
			System.out.println("Ooh a rookie quarterback that is a very risky choice. I like it!");
			team.add(draft.get(1));
			}
		else if (quarterBack.equals("3"))
			{
			System.out.println("Nice the hail marry king should bring you great success in the future.");
			team.add(draft.get(2));
			}
		else
			{
			System.out.println("Sorry that wasnt an option please choose again");
			pickQuarterback();
			}
		}
	public static void pickWideReciever()
		{
		System.out.println("Now you need a wide reciever.");
		System.out.println("Select a wide reciever 1, 2, or 3!");
		
		for(int i = 3; i <= 5; i++)
			{
			System.out.println((i-2) + ") " + draft.get(i).getName() + " for the " + draft.get(i).getTeam() + " with the number " + draft.get(i).getNumber());
			}
		Scanner userInput = new Scanner(System.in);
		String runningBack = userInput.nextLine();
		if(runningBack.equals("1"))
			{
			System.out.println("Nice one of the best recievers in the league rarely ever drops the ball!");
			team.add(draft.get(3));
			}
		else if (runningBack.equals("2"))
			{
			System.out.println("Nice a dynamic wide reciever that can be trouble with the run after catch average yards.");
			team.add(draft.get(4));
			}
		else if (runningBack.equals("3"))
			{
			System.out.println("Nice risky choice can be a little hot headed at times if things arent going his way, but if everything is going good he is dangerous.");
			team.add(draft.get(5));
			}
		else
			{
			System.out.println("Sorry that wasnt an option please choose again");
			pickWideReciever();
			}
		}
	public static void pickRunningBack()
		{
		System.out.println("Ok last but not least a runningback.");
		System.out.println("Select a runningback 1, 2, or 3!");
		for (int i = 6; i <= 8; i++)
			{
			System.out.println((i-5) +") " + draft.get(i).getName() + " for the " + draft.get(i).getTeam() + " with the number " + draft.get(i).getNumber());
			}
		Scanner userInput = new Scanner(System.in);
		String runningBack = userInput.nextLine();
		if(runningBack.equals("1"))
			{
			System.out.println("Nice choice the runner up for most rushing yards.");
			team.add(draft.get(6));
			}
		else if (runningBack.equals("2"))
			{
			System.out.println("Such a solid choice. such a solid running back and is bound to get you some wins!");
			team.add(draft.get(7));
			}
		else if (runningBack.equals("3"))
			{
			System.out.println("The veteran! nice was one of the best in the league but still a solid running back!");
			team.add(draft.get(8));
			}	
		else
			{
			System.out.println("Sorry that wasnt an option please choose again");
			pickRunningBack();
			}
		}
	public static void yourTeam()
		{
		System.out.println("This is your team.");
		for(Player p : team)
			{
			System.out.println(p.getName());
			}
		}
	}