import java.util.*;
public class WTF{
    
    static int[] num1;
    static int[] num2;
    
    WTF(int[] num1, int[] num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public static boolean same(){
        for (int i = 0; i<num1.length;i++){
            if(num1[i] == num2[i]){
                ;
            }else{
                return false;
            }
        }
        return true;
    }
}
