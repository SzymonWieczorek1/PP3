import java.util.*;
public class ShoppingList{
    
    private ArrayList<String> shoppingList = new ArrayList<String>();
    
    public void displayList(){
        System.out.println("Shopping list: "+String.join(", ",shoppingList));
    }
    
    public void displayNumber(){
        System.out.println("Number of products: "+shoppingList.size());
    }
    
    public void addProduct(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Add product: ");
        String product = myObj.nextLine();
        shoppingList.add(product);
    }
}
