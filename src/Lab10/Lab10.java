package Lab10;

import java.util.*;

public class Lab10 {

    public static void main(String[] args){
        MovieRating Mario = new MovieRating("Mario", 9.0);
        MovieRating Shrek = new MovieRating("Shrek", 12);
        MovieRating PussNBoots = new MovieRating("PussNBoots", 10);
        MovieRating OtherMovie = new MovieRating("OtherMovie", 3);

        ArrayList Movies = new ArrayList<MovieRating>();
        Movies.add(PussNBoots);
        Movies.add(Mario);
        Movies.add(OtherMovie);
        Movies.add(Shrek);

//        sortMovieRatings(Movies);
        findMovie(Movies,"Shrek");

    }

    static class MovieRating {
        private String title;
        private double rating;
        public MovieRating(String title, double rating) {
            this.title = title;
            this.rating = rating;
        }
    }

    static class sortByRating implements Comparator<MovieRating>{
        public int compare(MovieRating a, MovieRating b){
            System.out.println(Double.compare(a.rating, b.rating));
            return Double.compare(a.rating, b.rating);
        }
        // not sure which notation would this be because I don't know how to view comparator compare. may just be O(n^2)
    }
    static public List<MovieRating> sortMovieRatings(List<MovieRating> movieRatings){

        Collections.sort(movieRatings, new sortByRating());

        for (int i=0; i<movieRatings.size(); i++) {
            System.out.println(movieRatings.get(i).title);
        }

        return movieRatings;
    }

    static public double findMovie(List<MovieRating> n, String y){
        for (int i = 0; i < n.size(); i++){
            if (n.get(i).title.equals(y)){
                System.out.println(n.get(i).title + " is in the list with a rating of " + n.get(i).rating);
                return n.get(i).rating;
            }
        }
            System.out.println("Your movie is not in the list.");
            return -1.0;
    }
    // can we use binary search when searching with strings? no right? can''t halve a string, well you can but, you get
    // it
    // complexity should be O(n) since its only one if statement.

    public static List<MovieRating> mergeMovies(List<MovieRating> a, List<MovieRating> b){
        // could use hashsets if you don't want duplicates
        // but that wasn't asked for so I won't just gonna addall, sort and call it a day.
        ArrayList<MovieRating> combinedLists = new ArrayList<MovieRating>();

        combinedLists.addAll(a);
        combinedLists.addAll(b);

        // the problem asks to not resort them but then asks to have them in sorted order. The only way to
        // do that is to resort them, so instead of writing an additional method to sort them i'll just call
        // the existing method.

        Collections.sort(combinedLists, new sortByRating());

        // runtime complexity would be (Collections.sort complexity O(?) + O(1)

        return combinedLists;
    }
}
