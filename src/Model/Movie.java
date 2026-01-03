package Model;

public class Movie {
    private int movieId;
    private String movieName;
    private int moviePrice;
    private String movieClass;

    public Movie(int movieId,String movieName, int moviePrice, String movieClass){
        this.movieId=movieId;
        this.movieName=movieName;
        this.movieClass=movieClass;
        this.moviePrice=moviePrice;
    }

    public int getMovieId(){
        return movieId;
    }

}
