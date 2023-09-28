import java.util.Scanner;
public class number_game {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			int cpu = (int) (Math.random()*100);
			int attempts=10;
			while (attempts >= 0)
			{				
				System.out.println("Enter Your Guess; A number between 1 to 100");
				int guess = sc.nextInt();
				if (attempts == 0)
				{
					System.out.println("You have run out of attempts. Your Score is 0.");
					break;
				}
				else if (guess > 100 || guess < 0)
				{
					System.out.println("Please choose a number between 1 and 100. You lost a chance!");
					attempts--;
				}
				else if (guess == cpu)
				{
					System.out.println("Correct Guess! Your score is "+(10-attempts)+" out of 10");
					break;
				}
				else if (guess > cpu)
				{
					System.out.println("Your guess is higher.");
					attempts--;
				}
				else
				{
					System.out.println("Your guess is lower.");
					attempts--;
				}
			}
			System.out.print("Do you want to play again? Enter 1 for Yes / 0 for No : ");
			choice = sc.nextInt();
		}while(choice == 1);
		sc.close();
	}
}
