import java.util.Scanner;

public class TeamService {
	static Teams[] tarr;
	static int cnt;
	static {
		tarr=new Teams[20];
		Players[] plst= new Players[15];
		plst[0]=new Players(11,"Virat Kohali","Batsman");
		plst[1]=new Players(12,"Rohit Sharma","Batsman");
		plst[2]=new Players(13,"Hardik Pandya","Allrounder");
		Players c=new Players(11,"Rohit Sharma","Batsman");
		tarr[0]=new Teams(101,"MI",c,plst,3);
		
		Players[] plst1= new Players[15];
		plst1[0]=new Players(16,"Dravid","Batsman");
		plst1[1]=new Players(17,"Saurabh","Batsman");
		plst1[2]=new Players(18,"Sachin","Allrounder");
		Players c1=new Players(11,"Sachin","Allrounder");
		tarr[1]=new Teams(100,"RCB",c1,plst1,3);
		
		cnt=2;
		
	}
	public static boolean addNewTeam() {
		Scanner sc=new Scanner(System.in);
		if(cnt!=20) {
				//team details
				System.out.println("enter tid");
				int tid=sc.nextInt();
				System.out.println("enter team name");
				String tnm=sc.next();
				
				//captain
				System.out.println("enter captain player id");
				int pid=sc.nextInt();
				System.out.println("enter captain player name");
				String pnm=sc.next();
				System.out.println("enter captain player speciality");
				String sp=sc.next();
				Players c=new Players(pid,pnm,sp);
				//loop for creating player list
				Players[] plst=new Players[15];
				plst[0]=c;
				int i=1;
				String ans="y";
				do {
				System.out.println("enter player id");
				 pid=sc.nextInt();
				System.out.println("enter player name");
				 pnm=sc.next();
				System.out.println("enter player speciality");
			   sp=sc.next();
				plst[i]=new Players(pid,pnm,sp);
				i++;
				System.out.println("Do you want to add more(y/n)");
				 ans=sc.next();
				}while(ans.equals("y"));
				
				//add team object in the tarr at cnt position
				tarr[cnt]=new Teams(tid,tnm,c,plst,i);
				cnt++;
				return true;
		}
		return false;
	}
	public static void displayAll() {
		for(Teams t:tarr) {
			if (t!=null)
			{
				System.out.println(t);
			}else {
				break;
			}
		}
		
	}
	public static Teams findById(int tid) {
		for(Teams t:tarr) {
			if(t!=null) {
				if(t.getTid()==tid)
					return t;
			}else {
				break;
			}
		}
		return null;
	}
	
	public static boolean addNewPlayer(int tid, int pid, String pnm, String sp) {
		Teams t=findById(tid);
		if(t!=null) {
			Players p=new Players(pid,pnm,sp);
			int s=t.getSize();
			//adding player in player list of team
			t.getPlist()[s]=p;
			t.setSize(s+1);
			return true;
			
		}
		
		return false;
	}
	public static Teams findTeamByplayer(int pid) {
		for(Teams t:tarr) {
			if(t!=null) {
				//retrieve player array from team
				Players[] plst=t.getPlist();
				for(Players p:plst) {
					if(p!=null) {
						if(p.getId()==pid) {
							return t;
						}
					}else {
						break;
					}
				}
			}else {
				break;
			}
		}
		return null;
	}

}
