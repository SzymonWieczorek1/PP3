public class MyArrays{
    
    public static int max(int[] array){
        int max = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
        }}
        return max;
}
    public static int odd(int[] array){
        int count = 0;
        for(int i = 0; i<array.length;i++){
            if(array[i]%2 == 0){
                ;
            }else{
                count+=1;
            }
        }
        return count;
    }
}
