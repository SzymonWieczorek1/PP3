import java.util.Arrays;

public class Competition{
    double[] score;
    double mean;
    String name;
    
    public Competition(String name, double[] score){
        this.name = name;
        this.score = score;
        Arrays.sort(score);
    }
    
    void displayScores(){
        System.out.println("Name: "+name);
        System.out.println("Score: "+Arrays.toString(score));
        System.out.println("Final result: "+Double.toString(mean));
    }
    
    double calculateMean(){
        mean = (score[1]+score[2]+score[3])/3;
        return mean;
    }
    
}