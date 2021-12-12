public class Statistics{
    
    int first;
    int last;
    
    public Statistics(int first, int last){
        this.first = first;
        this.last = last;
    }
    
    static int numberOfItems(int first, int last){
      return last-first+1;  
    }
    
    static int sumOfNumbers(int first, int last){
        int sum = 0;
        for (int i = 0; i<(last-first)+1; i++){
            sum += (first+i);
        }
        return sum;
    }
    
    static double arithmeticMean(int first, int last){
        double f = first;
        double l = last;
        return (f+l)/2;
    }
    
    void displayInfo(){
        System.out.println("Number of items: "+numberOfItems(first, last));
        System.out.println("Sum of numbers: "+sumOfNumbers(first, last));
        System.out.println("Arithmetic mean: "+arithmeticMean(first, last));
    }
}