public class BankAccount{
    
    private static String bankName = "Bank of Essex";
    private String ownerName;
    private String ownerSurname;
    private double value;
    
    public BankAccount(String ownerName, String ownerSurname, double value){
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.value = value;
    }
    String getBankName(){
        return bankName;
    }
    
    String getOwnerName(){
        return ownerName;
    }
    
    String getOwnerSurname(){
        return ownerName;
    }
    
    double getValue(){
        return value;
    }
    
    void setOwnerName(String newName){
        this.ownerName = newName;
    }
    
    void setOwnerSurname(String newSurname){
        this.ownerSurname = newSurname;
    }
    
    void setValue(double newValue){
        this.value = newValue;
    }
    
    void displayInfo(){
        System.out.println("○○○○○○○○○○○○○○○○○○○○○○○○");
        System.out.println(getBankName());
        System.out.println("Owner name: "+getOwnerName()+"\nOwner Surname: "+getOwnerSurname());
        System.out.println("Account value: "+getValue()+" PLN");  
        System.out.println("○○○○○○○○○○○○○○○○○○○○○○○○");
    }
    
    void deposit(double infloat){
        value+=infloat;
        System.out.println("\nDeposited money: "+infloat+" PLN\n");
    }
    
    void withdraw(double outfloat){
        if(value>=outfloat){
            value-=outfloat;
            System.out.println("\nWithdrawn money: "+outfloat+" PLN\n");
        }else{
            System.out.println("\nUnsufficient funds, available funds: "+getValue()+"\n");
        }
    }
    
    public static void main(String[] args){
        BankAccount ba1 = new BankAccount("Szymon","Wieczorek",1000);
        ba1.displayInfo();
        ba1.deposit(500);
        ba1.displayInfo();
        ba1.deposit(200);
        ba1.displayInfo();
        ba1.withdraw(300);
        ba1.displayInfo();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
