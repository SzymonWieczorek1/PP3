public class Rectangles{
    
    int sideA;
    int sideB;
    
    Rectangles(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    
    void perim(){ 
        int p = 2*sideA+2*sideB;
        System.out.println("Perimeter: "+p);
    }
    
    void surf(){
        int s = sideA*sideB;
        System.out.println("Surface: "+s);
    }
    
    void display(){
        System.out.println("Dimensions: "+sideA+"x"+sideB); 
        surf();
        perim();
    }
}