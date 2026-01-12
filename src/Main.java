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
        map.put(1,new Movie(101,"Jana Nayagan",300,"First Class",10));
        map.put(2,new Movie(102,"Jana Nayagan",250,"Second Class",10));
        map.put(3,new Movie(103,"Jana Nayagan",150,"Third Class",10));
        map.put(4,new Movie(111,"ParaSakthi",300,"First Class",10));
        map.put(5,new Movie(112,"ParaSakthi",250,"Second Class",10));
        map.put(6,new Movie(113,"ParaSakthi",150,"Third Class",10));

        System.out.println("Enter Your Name: ");
        String name=sc.nextLine();
        User user=new User(1,name);
        while(true){
            System.out.println("\n-------------Movie Ticket Booking---------------");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. view seats");
            System.out.println("4. Exit");
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

                    System.out.print("Enter Choice: ");
                    int n1=sc.nextInt();
                    Movie select=map.get(n1);
                    if(select==null){
                        System.out.println("Invalid Movie ID");
                        break;
                    }
                    System.out.println("Enter How Many Tickets: ");
                    int num=sc.nextInt();
                    int total=0;
                    for(int i=1; i<=num; i++) {
                    Ticket ticket=service.bookTicket(user,select,"AGS Cinemas");

                        if (ticket != null) {
                            total =total + ticket.getFinalPrice();
                            System.out.println("\uD83C\uDF89 Ticket " +i +" Booked Successfully!!!");
                            System.out.println("            --------------------------------            ");
                            System.out.println("            "+"|      Ticket Id: " + ticket.getMovie().getMovieId()+"          |");
                            System.out.println("            "+"|      Final Price: " + ticket.getFinalPrice()+"        |");
                            System.out.println("            --------------------------------            ");
                        }
                    }
                    System.out.println("Total Amount ₹ " +total);
                    break;
                case 2:
                    service.viewTickets();
                    break;
                case 3:
                    System.out.println("----------------------------------------------------------------------------------");
                    System.out.println("|                                                                                |");
                    System.out.println("|                                                                                |");
                    System.out.println("|                                                                                |");
                    System.out.println("|                                                                                |");
                    System.out.println("|                                                                                |");
                    System.out.println("|                           ALL EYES SEE HERE                                    |");
                    System.out.println("|                                                                                |");
                    System.out.println("|                                                                                |");
                    System.out.println("|                                                                                |");
                    System.out.println("|                                                                                |");
                    System.out.println("|                                                                                |");
                    System.out.println("----------------------------------------------------------------------------------");
                  //  char ch[][]=new char[10][10];
                    int seat=1;
                    for(int i=1; i<=10; i++){
                        for(int j=1; j<=10; j++){
                            if(j<9){
                               // System.out.print("--");
                                System.out.print("| "+seat+" | ");
                              //  System.out.println("--");
                            }else{
                               // System.out.print("----");
                                System.out.print("| "+seat + " | ");
                               // System.out.print("----");
                            }
                            seat++;
                        }
                        System.out.println();
                    }
                    System.out.println("How many seats Do you Want: ");
                    int d1=sc.nextInt();

                    System.out.println("Enter Seat Number: ");
                    int s1[]=new int[d1]; //int index=1;
                    for(int i=0; i<d1; i++) {
                      //  for (int j = 1; j <= d1; j++) {
                        s1[i]=sc.nextInt();
                      //  }
                    }
                    System.out.println("Loading.....");
                    System.out.println("Successfully Booked \uD83C\uDF89");
                    int seats=1;
                    for(int i=1; i<=10; i++){
                        for(int j=1; j<=10; j++){
                            boolean boo=false;
                            for(int k=0; k<d1; k++) {
                                if (seats==s1[k]) {
                                   boo=true;
                                   break;
                                }
                            }
                            if(boo) {
                                // System.out.print("----");
                                System.out.print("| 0 |");
                            }else{
                                System.out.print("| "+seats + " | ");
                                // System.out.print("----");
                            }
                            seats++;
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Thank You! Visit again \uD83D\uDE0A");
                    System.out.print("---------------------Developed By ❤ Nandhini M---------------------");
                    return;
                default:
                    System.out.println("Invalid choice... Try again...");
            }
        }
    }
}