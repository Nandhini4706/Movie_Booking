package Service;

import Model.Movie;
import Model.Ticket;
import Model.User;
import java.util.*;
public class BookingService {

       private List<Ticket> tickets=new ArrayList<>();
        public int calculateBill(Movie movie){
            int price=movie.getMoviePrice();
            if(movie.getMovieClass().equals("First Class")){
                price = price+100;
            }else if(movie.getMovieClass().equals("Second Class")){
                price =price+50;
            }
                return price;

        }
        public Ticket bookTicket(User user, Movie movie, String theatre){
           if(user==null || movie==null){
               return null;
           }
               int finalPrice=calculateBill(movie);
               Ticket ticket=new Ticket(1,user,movie,theatre,finalPrice);
               tickets.add(ticket);
               return ticket;

        }
        public void viewTickets(){
               if(tickets.isEmpty()){
                   System.out.println("No Tickets Booked Yet");
                   return;
               }
               for(Ticket t:tickets){
                   System.out.println("        ----------------------------------------                ");
                   System.out.println("        | "+"Customer: " +t.getUser().getUserName() +"                   |");
                   System.out.println("        | "+"Movie: "+t.getMovie().getMovieName()+"                  |");
                   System.out.println("        | "+"Theatre: " +t.getTheatre()+"                 |");
                   System.out.println("        | "+"Price: " +t.getFinalPrice()+"                           |");
                   System.out.println("        ----------------------------------------                ");

               }
        }
}
