import java.util.*;

public class Triangle extends Shape{
    
    double a;
    double h;
    Triangle(double a, double h){
        this.a = a;
        this.h = h;
    }
    
    double perimeter(){
        double c = a*a+h*h;
        return a+h+(Math.sqrt(c));
    }
    double area(){
        return (a*h)/2;
    }

    public static void main(String[] args){
        Shape s1 = new Triangle(3,4);
        s1.display();
    }
}
