import java.util.*;

public class Proc2 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);

        Movie[] movie = new Movie[2];


        for(int i = 0; i < 2; i++) {
            String movieName = sc.next();
            String productionCompany = sc.next();
            String genre = sc.next();
            int budget = sc.nextInt();
            sc.nextLine();


            movie[i] = new Movie(movieName, productionCompany,genre,budget);
        }
        String search = sc.next();



        Movie[] m = Proc2.getBudgetForMovie(search, movie);

        for(int i = 0; i < 2; i++) {
            if(m[i] != null) {
                if (m[i].getBudget() > 80000000)
                    System.out.println("High Budget Movie");
                else
                    System.out.println("Low Budget Movie");
            }
        }

    }

    public static Movie[] getBudgetForMovie(String s, Movie[] m) {
        Movie[] ans = new Movie[4];

        int j = 0;
        for(int i = 0; i < 2; i++) {
            if(m[i].getGenre().equals(s)){
                ans[j] = m[i];
                j++;
            }
        }

        return ans;

    }
}

class  Movie {
    String movieName;
    String productionCompany;
    String genre;
    int budget;

    Movie(String movieName, String productionCompany, String genre, int budget) {
        this.movieName = movieName;
        this.productionCompany = productionCompany;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public String getGenre() {
        return genre;
    }

    public int getBudget() {
        return budget;
    }
}