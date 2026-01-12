package Model;

public class Movie {
    private int movieId;
    private String movieName;
    private int moviePrice;
    private String movieClass;
    private int ticketCount;
    public Movie(int movieId,String movieName, int moviePrice, String movieClass, int ticketCount){
        this.movieId=movieId;
        this.movieName=movieName;
        this.movieClass=movieClass;
        this.moviePrice=moviePrice;
        this.ticketCount=ticketCount;
    }

    public int getMovieId(){

        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMoviePrice() {
        return moviePrice;
    }

    public String getMovieClass() {
        return movieClass;
    }

    public int getTicketCount() {
        return ticketCount;
    }

}
