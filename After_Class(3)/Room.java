import java.util.*;
public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;
    Room(int number) {
        this.number=number;
        this.beds=2;
    }
    Room(int number, int beds) {
        this.number=number;
        this.beds=beds;
    }
    void checkIn(String guestName) {
        this.guestName=guestName;
        this.occupied=true;
    }
    void checkout() {
        this.occupied=false;
    }
    boolean isOccupied() {
        return occupied;
    }
    void displayStatus() {
        System.out.println(occupied==true ? ("Room number: " + number + ", number of beds: " + beds + ", is occupied? Yes, Guest name: " + guestName) : ("Room number: " + number + ", number of beds: " + beds + ", is occupied? No"));
    }
    public String toString() {
        return String.format(occupied==true ? ("Room number: " + number + ", number of beds: " + beds + ", is occupied? Yes, Guest name: " + guestName) : ("Room number: " + number + ", number of beds: " + beds + ", is occupied? No"));
    }
    public static void main(String[] args) {
        Room[] rooms = new Room[6];
        rooms[0]=new Room(112);
        rooms[1]=new Room(69);
        rooms[2]=new Room(143);
        rooms[3]=new Room(32, 3);
        rooms[4]=new Room(76, 3);
        rooms[5]=new Room(6, 1);
        rooms[5].checkIn("James Bond");
        rooms[5].displayStatus();
        for(int i=0; i<6; i++)
            rooms[i].displayStatus();
        for(int i=0; i<6; i++) {
            if(rooms[i].beds==3)
                rooms[i].displayStatus();
        }
        int vacant=0;
        int occ=0;
        for(int i=0; i<6; i++) {
            vacant=(rooms[i].isOccupied()==true ? vacant+1 : vacant);
            occ=(rooms[i].isOccupied()==false ? occ+1 : occ);
        }
        System.out.println("There are " + vacant + " vacant rooms and " + occ + "occupied rooms.");
        
    }
}