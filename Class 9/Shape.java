abstract class Shape{
    
    void display(){
        System.out.println("\n♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
        System.out.println("AREA: "+area()+" [j]^2");
        System.out.println("PERIMETER: "+perimeter()+" [j]");
        System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣\n");
    }
    abstract double area();
    abstract double perimeter();
    
}