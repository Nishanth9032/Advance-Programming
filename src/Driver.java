
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Driver {
	Scanner sc=new Scanner(System.in);
	Random ran=new Random();
	Game game;
	Athlete currentAthlete;
	Set<Athlete> athleteList = new HashSet<Athlete>();
public static void main(String args[]){
Driver d=new Driver();
d.menu();
}
public int getNumberOfAthletes(){
	int numberofAthletes = ran.nextInt(8);
	return numberofAthletes;
}
 int totalAthletes= getNumberOfAthletes();
public void menu(){
	System.out.println("===========================================");
	System.out.println("            OZYMPLIC GAMES");
	System.out.println("===========================================\n");
	System.out.println("1. Select a Game to run ");
	System.out.println("2. Predict the Winner of Game ");
	System.out.println("3. Start the Game ");
	System.out.println("4. Display the final result of all Games");
	System.out.println("5. Display the points of all Athletes");
	System.out.println("6. Exit ");
	int selec =sc.nextInt();
	switch(selec){
	case 1:
		if(totalAthletes > 4){
		gameSelect();
		}
		else if(totalAthletes < 4){
			System.out.println("Not Enough Athletes For This Game");
		}
		break;
	case 2:
	
		break;
	case 3:
		//start the game and generate values
		break;
	case 4:
		//display the output to user
		break;
	case 5:
		//display athletes with final result
		break;
	case 6:
		System.exit(0) ;
		break;
	}
	if(selec != 6){
		menu();
	}
}
public void gameSelect(){
	System.out.println("========== PLEASE SELECT A GAME EVENT ==========\n");
	System.out.println("1) SWIMMING \n");
	System.out.println("2) CYCLING \n");
	System.out.println("3) RUNNING \n");
	int choice=sc.nextInt();
	if(choice==1){
		new AthleteDataBase().loadAthlete(athleteList,8,'C');
		Iterator iterator = athleteList.iterator();
		while(iterator.hasNext()){
			currentAthlete = (Athlete)iterator.next();
			System.out.println(currentAthlete.getAthleteId());
		
		}
		
		System.out.println("No of athletes "+athleteList.size());
		
		game = new Game(new Cycling(),athleteList);
		game.initiateGame();
		game.rewardWinner();
		System.out.println(game.firstAthlete.getAthleteName()+" "+game.firstAthlete.getFinishTimer());
		System.out.println(game.secondAthlete.getAthleteName()+" "+game.secondAthlete.getFinishTimer());
		System.out.println(game.thirdAthlete.getAthleteName()+" "+game.thirdAthlete.getFinishTimer());	
		System.out.println(game.getWinnerName());
	}
	else if(choice==2){
		new AthleteDataBase().loadAthlete(athleteList,8,'R');
		game = new Game(new Running(),athleteList);
		game.initiateGame();
		game.rewardWinner();
		System.out.println(game.firstAthlete.getAthleteName()+" "+game.firstAthlete.getFinishTimer());
		System.out.println(game.secondAthlete.getAthleteName()+" "+game.secondAthlete.getFinishTimer());
		System.out.println(game.thirdAthlete.getAthleteName()+" "+game.thirdAthlete.getFinishTimer());	
		System.out.println(game.getWinnerName());
		
	}
	else if(choice==3){
		new AthleteDataBase().loadAthlete(athleteList,8,'S');
		game = new Game(new Swimming(),athleteList);
		game.initiateGame();
		game.rewardWinner();
		System.out.println(game.firstAthlete.getAthleteName()+" "+game.firstAthlete.getFinishTimer());
		System.out.println(game.secondAthlete.getAthleteName()+" "+game.secondAthlete.getFinishTimer());
		System.out.println(game.thirdAthlete.getAthleteName()+" "+game.thirdAthlete.getFinishTimer());	
		System.out.println(game.getWinnerName());
	}
	else{
		System.out.println("Please Give Right Input");
	}
}

public void gameWinner(){
	System.out.println("===== Predict Winner Of Game =====");
	
}

}
