package Model;

public class BookingService {
         public Ticket bookTicket(User user, Movie movie ){
             int finalPrice =calculateBill(movie);
             Ticket ticket =new Ticket(user, movie, finalPrice);
             return ticket;
         }
         private int calculateBill(Movie movie){
             return movie.getMoviePrice();
         }
}
