public class CinemaTicket{
    
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int row;
    int seat;
    float price;
    
    void displayInfo(){
        System.out.println("###########################");
        System.out.println("Nazwa kina: "+cinemaName);
        System.out.println("Tytuł: "+filmTitle);
        System.out.println("Rząd: "+row);
        System.out.println("Miejsce: "+seat);
        System.out.println("Cena biletu: "+price+" PLN");
        System.out.println("###########################");
        
    }
    
    public CinemaTicket(String filmTitle, int row, int seat){
        
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        
        
        if(row>2){
            price = 25.0f;
        }
        else{
            price = 10.0f;
        }
    }
    
    public static void main(String[] args) {
        CinemaTicket ticket1 = new CinemaTicket("Gladiator",2,7);
        CinemaTicket ticket2 = new CinemaTicket("Gladiator",7,10);
        ticket1.displayInfo();
        ticket2.displayInfo();
    }
}

