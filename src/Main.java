import java.util.*;
import Model.Movie;
import Model.Ticket;
import Model.User;
import Service.BookingService;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, Movie> map=new LinkedHashMap<>();
        BookingService service=new BookingService();
        map.put(1,new Movie(101,"Jana Nayagan",300,"First Class"));
        map.put(2,new Movie(102,"Jana Nayagan",250,"Second Class"));
        map.put(3,new Movie(103,"Jana Nayagan",150,"Third Class"));
        map.put(4,new Movie(111,"ParaSakthi",300,"First Class"));
        map.put(5,new Movie(112,"ParaSakthi",250,"Second Class"));
        map.put(6,new Movie(113,"ParaSakthi",150,"Third Class"));

        System.out.println("Enter Your Name: ");
        String name=sc.nextLine();
        User user=new User(1,name);
        while(true){
            System.out.println("\n-------------Movie Ticket Booking---------------");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. Exit");
            System.out.println("Enter Choice: ");
            int n=sc.nextInt();
            switch(n){
                case 1:
                    int count=1;
                    System.out.println("\n--------Available Movies: --------");
                    for(Movie m:map.values()) {
                        System.out.println(count +"." +m.getMovieId() +"->" +m.getMovieName() +"->" +m.getMoviePrice() +"->" +m.getMovieClass());
                        count++;
                    }


                    System.out.print("Enter Id: ");
                    int n1=sc.nextInt();
                    Movie select=map.get(n1);
                    if(select==null){
                        System.out.println("Invalid Movie ID");
                        break;
                    }
                    Ticket ticket=service.bookTicket(user,select,"AGS Cinemas");
                    int id=1;
                    if(ticket !=null){
                        System.out.println("\uD83C\uDF89 Ticket Booked Successfully!!!");
                        System.out.println("Ticket Id: " + ticket.getTicketId());
                        System.out.println("Final Price: " +ticket.getFinalPrice());

                    }
                    break;
                case 2:
                    service.viewTickets();
                    break;
                case 3:
                    System.out.println("Thank You! Visit again \uD83D\uDE0A");
                    return;
                default:
                    System.out.println("Invalid choice... Try again...");
            }
        }
    }
}