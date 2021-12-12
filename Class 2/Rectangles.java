public class Rectangles{
    
    int a;
    int b;
    
    void displayInfo(){
        System.out.println(a + "x" + b); 
    }
    
    void perimeter(){
        int per = 2*b+2*a;
        System.out.println("Perimeter: " + per);
    }
    
    void surfaceArea(){
        int sur = a*b;
        System.out.println("Surface area: " + sur);
    }
}
