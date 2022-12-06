
import java.util.*;


class Guesser{
	int guessNum;
	int max;

	int maxLimit(){
		System.out.println("=====================================");
		System.out.println("Select the max number limit of guessing");
        System.out.println("=====================================\n");
		
		Scanner sc = new Scanner(System.in);
		max =  sc.nextInt();
		return max;

	}
	
	int guessNum()
	{	

		guessNum = (int)(Math.random()*(max+1));
		
        System.out.println("\n=====================================");
		System.out.println("Computer guessed the number in between 0 to " + max + " (Inclusive) " + guessNum);
        System.out.println("=====================================\n");

		return guessNum;
	}	
}

class Player{
	static int playerNumber = 1;
	int guessNum;
	String name;

	void setName(){
		System.out.print("Enter player " + playerNumber + " name :- ");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.println();
		playerNumber++;
	}
	
	void guessNum(int max){
	
		Scanner scan=new Scanner(System.in);
        System.out.println("=====================================");
		System.out.println(name + " kindly guess the number");
        System.out.println("=====================================\n");

		while(true){
			guessNum=scan.nextInt();
			System.out.println();
			if(guessNum<=max && guessNum>0){
				return;
			}
			else{
				System.out.println("Please try again in range 0 to " + max +"\n");
			}
			
		}
		
		
	}
}

class Umpire{
	int numFromGuesser;
	Player[] player = new Player[3];
	Scanner sc = new Scanner(System.in);
	int limit;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		limit = g.maxLimit();
		numFromGuesser=g.guessNum();

	}

	void collectNumFromPlayers()
	{
		for (int i = 0; i < player.length; i++) {
			player[i] = new Player();
			player[i].setName();
			player[i].guessNum(limit);
		}
	}
	
	void result(){
		System.out.println("=====================================");
		System.out.println("                  Results            ");
		System.out.println("=====================================\n");
		for (int i = 0; i < player.length; i++) {
			if(numFromGuesser == player[i].guessNum){
				System.out.println("=====================================");
				System.out.println(player[i].name + " won the game. Congratulations\nComputer guessed number:-" + numFromGuesser +"\n"+ player[i].name +" guessed number:- " + player[i].guessNum);
				System.out.println("=====================================\n");
			}
			else{
				System.out.println("=====================================");
				System.out.println(player[i].name + " lost the game. Try again\nComputer guessed number:-" + numFromGuesser +"\n"+ player[i].name +" guessed number:- " + player[i].guessNum);
				System.out.println("=====================================\n");
			}
		}
		System.out.println("=====================================");
		System.out.println("                  End                ");
		System.out.println("=====================================\n");

	}
	
}

class GuesserGame {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================================");
		System.out.println("             Guesser Game            ");
        System.out.println("=====================================\n");


		do{	

			System.out.println("=====================================");
			System.out.println("To start the press 1 and enter \nTo end the game press any number and enter");
			System.out.println("=====================================\n");

			int start = sc.nextInt();
			if(start != 1){
				break;
			}

			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.result();

		}while(true);
        
    }
}