import java.util.Arrays;  
import java.util.ArrayList;

public class ShoppingList{
    
    private ArrayList<String> shoppingList = new ArrayList<String>();
    
    public void displayList(){
        System.out.println("Shopping list: "+String.join(", ",shoppingList));
    }
    
    public void displayNumber(){
        System.out.println("Number of products: "+shoppingList.size());
    }
    
    public void addProduct(String product){
        shoppingList.add(product);
    }
}
