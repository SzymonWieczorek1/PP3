public class Circle extends Shape{
    
    double r;
    
    Circle(double r){
        this.r = r;
    }
    
    double perimeter(){
        return 2*3.14*r;
    }
    double area(){
        return r*r*3.14;
    }
    public static void main(String[] args){
        Shape s1 = new Circle(3);
        s1.display();
    }
}