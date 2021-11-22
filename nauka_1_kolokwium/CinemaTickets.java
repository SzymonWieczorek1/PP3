
public class CinemaTickets{
    
    int seat;
    int row;
    boolean today;
    String title;
    String cinema = "Dublin";
    int price;
    
    CinemaTickets(String title, boolean today, int seat, int row){
        this.title = title;
        this.today = today;
        this.seat = seat;
        this.row = row;
        if(row<=2){
            price = 10;
        }else{
            price = 25;
        }
    }
    void display(){
        System.out.println("XXXXXXXXXXXXXXXXXXX");
        System.out.println("Cinema "+cinema);
        System.out.println("Movie: "+title);
        System.out.println("Played today: "+today);
        if(today == false){
            ;
        }else{
            System.out.println("Row: "+row+" Seat: "+seat);
            System.out.println("Price: "+price);
        }
    }
    public static void main(String[] args){
        CinemaTickets ticket0 = new CinemaTickets("Gladiator",false,3,4);
        CinemaTickets ticket1 = new CinemaTickets("Matrix",true,3,1);
        
        ticket0.display();
        ticket1.display();
    }
    
}



