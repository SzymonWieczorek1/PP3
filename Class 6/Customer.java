public class Customer{
    
    private String name;
    private double money;
    private int age;
    private int productsBought;
    
    public Customer(String name, double money, int age, int productsBought){
        
        this.name = name;
        this.money = money;
        this.age = age;
        this.productsBought = productsBought;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public double getMoney(){
        return money;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setMoney(int newMoney){
        this.money = newMoney;
    }
    
    public String toString(){
        return "Name: "+getName()+" Money: "+getMoney()+" Age: "+getAge()+" Products bought: " +productsBought;
    }}
