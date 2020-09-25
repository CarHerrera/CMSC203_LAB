import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String movieName = "";
		String movieLoop = "yes";
		while(movieLoop.equalsIgnoreCase("yes")) {
			Movie movie = new Movie();
			System.out.println("What would you like to name your movie?");
			movieName = sc.nextLine();
			movie.setTitle(movieName);
			System.out.println("Please enter the Rating of the movie");
			movie.setRating(sc.nextLine());
			System.out.println("Please enter the number of tickets sold at theaters");
			movie.setSoldTickets(sc.nextInt());
			System.out.println(movie.toString());
			System.out.println("Would you like to enter another movie? yes or no");
			sc.nextLine();
			
			movieLoop = sc.nextLine();
		}
		System.out.println("Goodbye");
		System.exit(0);
	}

}
