
public class Player
	{
	String name;
	String team;
	String position;
	int number;
	public Player(String na, String t, String po, int n)
		{
		name = na;
		team = t;
		position = po;
		number = n;
		}
	public String getName()
		{
			return name;
		}
	public void setName(String name)
		{
			this.name = name;
		}
	public String getTeam()
		{
			return team;
		}
	public void setTeam(String team)
		{
			this.team = team;
		}
	public String getPosition()
		{
			return position;
		}
	public void setPosition(String position)
		{
			this.position = position;
		}
	public int getNumber()
		{
			return number;
		}
	public void setNumber(int number)
		{
			this.number = number;
		}
	}