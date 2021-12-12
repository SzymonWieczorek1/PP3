
import java.util.*;
public class Math{
    ArrayList<Integer> nums = new ArrayList<Integer>();
    int one;
    int two;
    int three;
    int four;
    int five;
    int index = nums.size()-1;

    
    Math(int one, int two, int three, int four, int five){
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        nums.add(one);
        nums.add(two);
        nums.add(three);
        nums.add(four);
        nums.add(five);
    }
    
    void sort(){
        Collections.sort(nums);
        
    }
    
    void delete(){
        nums.remove(0);
        nums.remove(index);
        
    }
    
    void display(){
        System.out.println("Zostało: " + nums);
    }
}
    
    
    
}