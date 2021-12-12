public class Processor{
    
    private static String brand = "Intel";
    private boolean produced;
    private int year;
    private String name;
    private int cores;
    private double timing;
    private int gen;
    
    Processor(String name, int gen, int year, int cores, double timing){
        this.name = name;
        this.gen = gen;
        this.year = year;
        this.cores = cores;
        this.timing = timing;
        if(year>=2015){
            produced = true;
        }else{
            produced = false;
        }
    }
    
    String getName(){
        return name;
    }
    
    int getGen(){
        return gen;
    }
    
    int getCores(){
        return cores;
    }
    
    double getTiming(){
        return timing;
    }
    
    boolean getProduced(){
        return produced;
    }
    
    void setCores(int newCores){
        this.cores = newCores;
    }
    
    void setTiming(int newTiming){
        this.timing = newTiming;
    }
    
    void changeProduced(){
        if(produced=true){
            produced = false;
        }else{
            produced = true;
        }
    }
    
    public String toString(){
        return "CPU Model: "+getName()+"\n"+"Generation: "+getGen()+"\n"+"Number of cores: "+getCores()+"\n"+"Timing: "+getTiming()+"\n";
    }
}
