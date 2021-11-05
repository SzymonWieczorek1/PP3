public class DrivingLicense{
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String number;
    private int date;
    private String category;
    
    public DrivingLicense(String name, String surname, String address,String postalCode, String city, String number, int date, String category){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.number = number;
        this.date = date;
        this.category = category;
    }
    
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public int getDate(){
        return this.date;
    }
    public String getNumber(){
        return number;
    }
    public String getCategory(){
        return this.category;
    }
    public String getPostalCode(){
        return postalCode;
    }
    
    public void setName(String name){
        String k = name.substring(0,1).toUpperCase();
        String l = name.substring(1).toLowerCase();
        this.name = k+l;
    }
    public void setSurname(String surname){
        String n = surname.substring(0,1).toUpperCase();
        String b = surname.substring(1).toLowerCase();
        this.surname = n+b;
    }
    public void setAddres(String address){
        this.address = address;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setDate(int date){
        if(date >= 1980 && date<=2021){
            this.date = date;
        }else{
    
        }
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    
    
    public String toString(){
        return getName()+" "+getSurname()+ " Valid since: "+getDate();
    }
    void displayInfo(){
        System.out.println("_________________________________________________");
        System.out.println("|Name: "+getName()+"  Surname: "+getSurname()+"\n|Address: "+getAddress()+"  City: "+getCity()+"  Postal code: "+getPostalCode());
        System.out.println("|License number: "+getNumber()+"  Category: "+getCategory()+"  Date: "+getDate());
    }
    static void Main(){
        DrivingLicense dl1 = new DrivingLicense("Szymon", "Wieczorek","Maślana 32","32-333","Larwowo","XDD 3443",2002,"B");
        dl1.displayInfo();
    }
    
}