import java.util.Scanner;

public class proc2practice {
    public static void main(String args[])
    {
        Movie m[]=new Movie[2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m.length;i++)
        {
             String movieName=sc.nextLine();
             String productionCompany=sc.nextLine();
             String genre=sc.nextLine();

            int budget=sc.nextInt();
            sc.nextLine();
            m[i]=new Movie(movieName,productionCompany,genre,budget);
        }
        String sttr=sc.nextLine();
        Movie[] res=proc2practice.fun(sttr,m);
        for(int i=0;i<res.length;i++)
        {
            if(res[i]!=null)
                System.out.println(res[i].getGenre()+ " "+res[i].getGenre());
        }
    }
    public static Movie[] fun(String s,Movie[] a)
    {
        Movie temp[]=new Movie[2];
        for(int i=0;i<a.length;i++)
        {
            if(a[i].getGenre().equals(s))
            {
                temp[i]=a[i];
            }
        }
        return temp;
    }
    public static class Movie
    {
        private String movieName;
        private String productionCompany;
        private String genre;
        private int budget;

        public Movie(String movieName, String productionCompany, String genre, int budget) {
            this.movieName = movieName;
            this.productionCompany = productionCompany;
            this.genre = genre;
            this.budget = budget;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public String getProductionCompany() {
            return productionCompany;
        }

        public void setProductionCompany(String productionCompany) {
            this.productionCompany = productionCompany;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getBudget() {
            return budget;
        }

        public void setBudget(int budget) {
            this.budget = budget;
        }



    }
}


