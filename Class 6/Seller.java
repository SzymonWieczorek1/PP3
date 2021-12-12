public class Seller{
    
    private String name;
    private boolean company;
    private int age;
    private int salesMade;
    
    public Seller(String name, boolean company, int age, int salesMade){
        
        this.name = name;
        this.company = company;
        this.age = age;
        this.salesMade = salesMade;
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public boolean getCompany(){
        return company;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setCompany(boolean isCompany){
        this.company = isCompany;
    }
    
    public String toString(){
        return "Name: "+getName()+" Is a company: "+getCompany()+" Age: "+getAge()+" Sales made: " +salesMade;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
