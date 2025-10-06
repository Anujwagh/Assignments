
public class TestTeam {

	public static void main(String[] args) {
		Players[] plist= {
				
				new Players(18,"Virat kohli", "Batsman"),
				new Players(45,"Rohit Sharma", "Batsman"),
				new Players(07,"M S Dhoni", "Allrounder"),
				
		};

		Players c = new Players(45,"Rohit Sharma", "Batsman");
		Teams t1 = new Teams(100,"MI",c,plist,3);
		
		System.out.println(c);
		System.out.println(t1);
	}

}
