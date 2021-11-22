public class Car{
    
    private String brand;
    private String model;
    private int price;
    private boolean inStock;
    private String[] subModel;
    
    
    Car(String brand, String model, int price, boolean inStock, String[] subModel){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.inStock = inStock;
        this.subModel = subModel;
    }
    
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }
    public boolean getInStock(){
        return inStock;
    }
    public String[] getSubModel(){
        return subModel;
    }
    public String toString(){
        return "Manufacturer: " + getBrand() +" Model: "+getModel()+" Price: "+getPrice()+" In stock: "+getInStock();
    }
    
    
    
}
