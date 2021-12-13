public class Rectangle extends Shape{
    
    double x;
    double y;
    
    Rectangle(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    double perimeter(){
        return 2*x+2*y;
    }
    double area(){
        return x*y;
    }

    public static void main(String[] args){
        Shape s1 = new Rectangle(3,4);
        s1.display();
    }
}
