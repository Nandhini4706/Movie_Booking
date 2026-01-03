package Model;

public class Ticket {
    private int ticketId;
    private User user;
    private Movie movie;
    private String theatre;
    private int finalPrice;

    public Ticket(int ticketId, User user, Movie movie, String theatre, int finalPrice) {
        this.user = user;
        this.theatre=theatre;
        this.ticketId=ticketId;
        this.movie=movie;
        this.finalPrice=finalPrice;
    }

    public int getTicketId() {
        return ticketId;
    }

    public User getUser() {
        return user;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getTheatre() {
        return theatre;
    }

    public int getFinalPrice() {
        return finalPrice;
    }
}
