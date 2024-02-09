package ObjectsArrays;

import java.util.Comparator;

class Movie {
    String title;
    int yearReleased;
    double rating;
    double budget;
    double collectionAmount;

    public Movie(String title, int yearReleased, double rating, double budget, double collectionAmount) {
        this.title = title;
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    public String getTitle() {
        return title;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }
}

class RatingProfitComparator implements Comparator<Movie> {
    public int compare(Movie movie1, Movie movie2) {
        double profit1 = movie1.getCollectionAmount() - movie1.getBudget();
        double profit2 = movie2.getCollectionAmount() - movie2.getBudget();

        if (movie1.getRating() == movie2.getRating()) {
            return Double.compare(profit2, profit1);
        }
        return Double.compare(movie2.getRating(), movie1.getRating());
    }
}

class YearRatingComparator implements Comparator<Movie> {
    public int compare(Movie movie1, Movie movie2) {
        if (movie1.getYearReleased() == movie2.getYearReleased()) {
            return Double.compare(movie2.getRating(), movie1.getRating());
        }
        return Integer.compare(movie2.getYearReleased(), movie1.getYearReleased());
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {
        // Example usage:
        Movie movie1 = new Movie("Movie 1", 2000, 8.5, 1000000, 5000000);
        Movie movie2 = new Movie("Movie 2", 2005, 9.0, 1500000, 8000000);

        RatingProfitComparator ratingProfitComparator = new RatingProfitComparator();
        YearRatingComparator yearRatingComparator = new YearRatingComparator();

        System.out.println("Comparison by Rating and Profit:");
        System.out.println(ratingProfitComparator.compare(movie1, movie2));

        System.out.println("Comparison by Year Released and Rating:");
        System.out.println(yearRatingComparator.compare(movie1, movie2));
    }
}

