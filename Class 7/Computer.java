import java.util.*;
public class Computer{
    
    private Processor cpu;
    private static String producer = "HP";
    private String model;
    private boolean onSale;
    private float price;
    
    Computer(String model, Processor cpu, boolean onSale, float price){
        this.model = model;
        this.cpu = cpu;
        this.onSale = onSale;
        this.price = price;
    }
    
    String getProducer(){
        return producer;
    }
    String getModel(){
        return model;
    }
    public String toString(){
        return "Marka: "+getProducer()+"\nModel: "+getModel()+"\n"+cpu.toString();
    }
    
    public static void main(String[] args){
        Processor cpu1 = new Processor("Core i5",7,2016,5,2.5);
        Computer cp1 = new Computer("Pavilion",cpu1,true,5000);
        System.out.println(cp1);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}