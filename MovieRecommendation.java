import java.util.ArrayList;
import java.util.Scanner;

public class MovieRecommendation {
    public static void main(String[] args) {
        ArrayList<String[]> movies = new ArrayList<>();
        movies.add(new String[] {"The Godfather", "Crime"});
        movies.add(new String[] {"The Dark Knight", "Action"});
        movies.add(new String[] {"Fast & Furious", "Action"});
        movies.add(new String[] {"The Matrix", "Sci-fi"});
        movies.add(new String[] {"The Big Lebowski", "Comedy"});
        movies.add(new String[] {"Blade Runner", "Sci-ci"});
        movies.add(new String[] {"Forrest Gump", "Drama"});
        movies.add(new String[] {"John Wick", "Crime"});
        movies.add(new String[] {"Titanic", "Drama"});
        movies.add(new String[] {"Ant-Man", "Comedy"});
        movies.add(new String[] {"American Psycho", "Crime"});
        movies.add(new String[] {"Heat", "Drama"});

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your preferred genre: ");
        String preferredGenre = input.nextLine();

        ArrayList<String> recommendMovies = new ArrayList<>();
        for (String [] movie: movies) {
            if (movie[1].equalsIgnoreCase(preferredGenre)) {
                recommendMovies.add(movie[0]);
            }
        }

        if (recommendMovies.size() == 0) {
            System.out.println("Sorry, we don't have any movies in that genre");
        } else {
            System.out.println("We recommend the following movies in the " + preferredGenre + " genre:");
            for (String movie : recommendMovies) {
                System.out.println("- " + movie);
            }
        }
    }
}
