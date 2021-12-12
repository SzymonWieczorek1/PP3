public class Product{
    
    private String name;
    private String producer;
    private int price;
    private int yearOfProduction;
    
    public Product(String name, String producer, int price, int yearOfProduction){
        
        this.name = name;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.producer = producer;
        
    }
    
    public String getName(){
        return name;
    }
    
    public String getProducer(){
        return producer;
    }
    public double getPrice(){
        return price;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setPrice(int newPrice){
        this.price = newPrice;
    }
    
    public String toString(){
        return "Name: "+getName()+" Price: "+getPrice()+" Age: "+yearOfProduction+" Producer: " +getProducer();
    }
}