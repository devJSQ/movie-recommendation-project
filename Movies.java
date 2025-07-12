import java.util.*;

class Movie {
    int id;
    String name;
    double rate;
    int year;
    String genre;

  
    public Movie(int id, String name, double rate, int year, String genre) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.year = year;
        this.genre = genre.toLowerCase();
    }
}
class DecisionTree {
    private Scanner scanner = new Scanner(System.in);
    private List<Movie> movies;

    public DecisionTree(List<Movie> movies) {
        this.movies = movies;
    }

    public void start() {
        System.out.println("do you like comedy movies?");
        if (ask()) {
            recommend("comedy");
            return;
        }
        System.out.println("do you like action movies???");
        if (ask()) {
            System.out.println("do you like old movies (before 2000)?");
            if (ask()) {
                recommend("action", true);
            } else {
                recommend("action", false);
            }
            return;
        }

        System.out.println("do you like anime movies?");
        if (ask()) {
            System.out.println("Do you like old movies (before 2000)??");
            if (ask()) {
                recommend("animation", true);
            } else {
                recommend("animation", false);
            }
            return;
        }

        System.out.println("Do you like drama movies?");
        if (ask()) {
            System.out.println("do you like old movies (before 2000)?");
            if (ask()) {
                recommend("drama", true);
            } else {
                recommend("drama", false);
            }
        } else {
            System.out.println("sorry, I couldn't find a match for your preferences :(");
        }
    }

    private boolean ask() {
        String input = scanner.nextLine().toLowerCase();
        return input.equals("yes");
    }

    private void recommend(String genre) {
        recommend(genre, null);
    }

    private void recommend(String genre, Boolean isOld) {
        Movie best = null;
        for (Movie m : movies) {
          //cmp ignore case
            if (m.genre.equalsIgnoreCase(genre)) {
                if (isOld == null || (isOld && m.year < 2000) || (!isOld && m.year >= 2000)) {
                    if (best == null || m.rate > best.rate) {
                        best = m;
                    }
                }
            }
        }

        if (best != null) {
            System.out.println("\nWe recommend the following movie for you:");
            System.out.println("Movie name: " + best.name);
            System.out.println("Year: " + best.year);
            System.out.println("Genre: " + best.genre);
            System.out.println("Rate: " + best.rate);
        } else {
            System.out.println("sorry, no suitable movies found :(");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Movie> movieList = Arrays.asList(
            new Movie(1, "The Matrix", 8.7, 1999, "action"),
            new Movie(2, "The Dark Knight", 9.0, 2008, "action"),
            new Movie(3, "Terminator 2: Judgment Day", 8.6, 1991, "action"),
            new Movie(4, "WALL·E", 8.4, 2008, "animation"),
            new Movie(5, "The Lion King", 8.5, 1994, "animation"),
            new Movie(6, "Oppenheimer", 8.3, 2023, "drama"),
            new Movie(7, "Taxi Driver", 8.2, 1976, "drama"),
            new Movie(8, "Bad Boys: Ride or Die", 7.0, 2024, "comedy"),
            new Movie(9, "Bad Boys", 6.8, 1995, "comedy")
        );

        DecisionTree tree = new DecisionTree(movieList);
        tree.start();
    }
}
